package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.events.UserRegistrationEvent;
import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.entity.VerificationToken;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import bg.softuni.pcstore.repository.RoleRepository;
import bg.softuni.pcstore.repository.UserRepository;
import bg.softuni.pcstore.repository.VerificationTokenRepository;
import bg.softuni.pcstore.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

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
        if (userRepository.count() <= 0 ) {
            RoleEntity admin = roleRepository.findByRoleName(RoleNameEnum.ADMIN);
            user.setRoles(Set.of(userRole,admin));
        } else {
        user.setRoles(Set.of(userRole));
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

        if (token == null || token.isEmpty()) {
            return false;
        }

        VerificationToken byToken = verificationTokenRepository.findByToken(token);
        UserEntity user = byToken.getUser();
        user.setDisabled(false);
        userRepository.save(user);
        return true;
    }
}
