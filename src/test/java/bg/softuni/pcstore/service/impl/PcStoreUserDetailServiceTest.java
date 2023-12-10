package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import bg.softuni.pcstore.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PcStoreUserDetailServiceTest {
    private PcStoreUserDetailService serviceToTest;
    @Mock
    private UserRepository mockUserRepository;

    @BeforeEach
    void setUp() {
        serviceToTest = new PcStoreUserDetailService(mockUserRepository);
    }


    @Test
    void testUserNotFound() {
        Assertions
                .assertThrows(UsernameNotFoundException.class,
                        () -> serviceToTest.loadUserByUsername("user123"));
    }

    @Test
    void UserFoundException() {
        UserEntity user = createTestUser();
        when(mockUserRepository.findByUsername(user.getUsername()))
                .thenReturn(Optional.of(user));

        UserDetails userDetails = serviceToTest.loadUserByUsername(user.getUsername());

        Assertions.assertNotNull(userDetails);
        Assertions.assertEquals(user.getUsername(), userDetails.getUsername(), "Username is not mapped to username!");
        Assertions.assertEquals(user.getPassword(), userDetails.getPassword());
        Assertions.assertNotNull(userDetails.getAuthorities());
        Assertions.assertEquals(1, userDetails.getAuthorities().size());
        Assertions.assertTrue(containsAuthority(userDetails, "ROLE_" + RoleNameEnum.ADMIN), "The user is not admin!");


    }


    private static UserEntity createTestUser() {
        return new UserEntity()
                .setFirstName("firstName")
                .setLastName("lastName")
                .setUsername("tuci")
                .setEmail("email@example.com")
                .setPassword("topSecret")
                .setDisabled(true)
                .setRole(new RoleEntity().setRoleName(RoleNameEnum.ADMIN));
    }

    private boolean containsAuthority(UserDetails userDetails, String expectedAuthority) {
        return userDetails.getAuthorities()
                .stream()
                .anyMatch(a -> expectedAuthority.equals(a.getAuthority()));
    }
}
