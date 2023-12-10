package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.model.dto.UserRegisterDto;
import bg.softuni.pcstore.repository.RoleRepository;
import bg.softuni.pcstore.repository.UserRepository;
import bg.softuni.pcstore.repository.VerificationTokenRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserServiceImpl serviceToTest;
    @Mock
    private UserRepository userRepository;
    @Mock
    private RoleRepository roleRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @Mock
    private VerificationTokenRepository verificationTokenRepository;
    @Mock
    private ApplicationEventPublisher applicationEventPublisher;
    @Mock
    private ModelMapper mapper;

    @BeforeEach
    void setUp() {
        serviceToTest = new UserServiceImpl(userRepository, roleRepository, passwordEncoder, verificationTokenRepository, applicationEventPublisher, mapper) {
        };
    }

    @Test
    void nullPointerRegistration() {
        UserRegisterDto testUser = createTestUser();
        Assertions.assertThrows(NullPointerException.class, ()-> serviceToTest.register(testUser));
    }




    private static UserRegisterDto createTestUser() {
        return new UserRegisterDto()
                .setFirstName("firstName")
                .setLastName("lastName")
                .setUsername("tuci")
                .setEmail("email@example.com")
                .setPassword("topSecret")
                .setConfirmPassword("topSecret");
    }

}