package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.events.UserRegistrationEvent;
import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.repository.UserRepository;
import bg.softuni.pcstore.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private final ApplicationEventPublisher applicationEventPublisher;

    private final ModelMapper mapper;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, ApplicationEventPublisher applicationEventPublisher, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.applicationEventPublisher = applicationEventPublisher;
        this.mapper = mapper;
    }

    @Override
    public void register(UserRegisterDto userRegisterDto) {

        UserEntity user = mapper.map(userRegisterDto, UserEntity.class);
        user.setPassword(passwordEncoder.encode(userRegisterDto.getPassword()));
        userRepository.save(user);

        applicationEventPublisher.publishEvent(new UserRegistrationEvent(
                "UserService",
                userRegisterDto.getUsername(),
                userRegisterDto.getEmail()
        ));
    }
}
