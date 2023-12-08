package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.events.UserRegistrationEvent;
import bg.softuni.pcstore.exception.ExpiredLinkException;
import bg.softuni.pcstore.exception.ObjectNotFoundException;
import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.model.dto.UserShortSummaryDTO;
import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.entity.VerificationToken;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import bg.softuni.pcstore.repository.RoleRepository;
import bg.softuni.pcstore.repository.UserRepository;
import bg.softuni.pcstore.repository.VerificationTokenRepository;
import bg.softuni.pcstore.service.UserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    private final VerificationTokenRepository verificationTokenRepository;

    private final ApplicationEventPublisher applicationEventPublisher;

    private final ModelMapper mapper;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, VerificationTokenRepository verificationTokenRepository, ApplicationEventPublisher applicationEventPublisher, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.verificationTokenRepository = verificationTokenRepository;
        this.applicationEventPublisher = applicationEventPublisher;
        this.mapper = mapper;
    }

    @Override
    public void register(UserRegisterDto userRegisterDto) {

        UserEntity user = mapper.map(userRegisterDto, UserEntity.class);
        user.setPassword(passwordEncoder.encode(userRegisterDto.getPassword()));
        RoleEntity userRole = roleRepository.findByRoleName(RoleNameEnum.USER);
        if (userRepository.count() <= 0) {
            RoleEntity admin = roleRepository.findByRoleName(RoleNameEnum.ADMIN);
            user.setRole(admin);
        } else {
            user.setRole(userRole);
        }
        userRepository.save(user);

        applicationEventPublisher.publishEvent(new UserRegistrationEvent(
                "UserService",
                userRegisterDto.getFullName(),
                userRegisterDto.getEmail(),
                userRegisterDto.getUsername()));
    }

    @Override
    public boolean activateAccount(String token) {

        if (token == null || token.isEmpty() || verificationTokenRepository.findByToken(token) == null) {
        throw new ObjectNotFoundException("Token not found!");
        }


        VerificationToken byToken = verificationTokenRepository.findByToken(token);
        if (byToken.getCreated().isBefore(Instant.now().minusSeconds(600))) {
            throw new ExpiredLinkException("Link expired!");
        }

        UserEntity user = byToken.getUser();
        user.setDisabled(false);
        userRepository.save(user);
        return true;
    }

    @Override
    public Page<UserShortSummaryDTO> getAllUsers(Pageable pageable, String keyword) {
        if (keyword != null && !keyword.isBlank()) {
            return userRepository.search(pageable, keyword)
                    .map(UserServiceImpl::mapToShortSummary);
        }
        return userRepository.findAllUsers(pageable)
                .map(UserServiceImpl::mapToShortSummary);
    }

    @Transactional
    @Override
    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
    }

    @Override
    public void makeAdmin(String username) {
        Optional<UserEntity> byUsername = userRepository.findByUsername(username);
        if (byUsername.isEmpty()) {
            throw new ObjectNotFoundException("User not found!");
        }
        UserEntity user = byUsername.get().setRole(roleRepository.findByRoleName(RoleNameEnum.ADMIN));
        userRepository.save(user);
    }

    private static UserShortSummaryDTO mapToShortSummary(UserEntity user) {


        return new UserShortSummaryDTO()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setRole(user.getRole().getRoleName().name())
                .setUsername(user.getUsername());
    }

}
