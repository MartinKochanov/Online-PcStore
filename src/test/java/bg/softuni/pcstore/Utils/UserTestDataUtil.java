package bg.softuni.pcstore.Utils;

import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import bg.softuni.pcstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserTestDataUtil {

    @Autowired
    private UserRepository userRepository;

    public UserEntity createTestUser(String email) {
        return createUser(email, RoleNameEnum.ADMIN);
    }

    public UserEntity createTestAdmin(String email) {
        return createUser(email, RoleNameEnum.USER);
    }

    private UserEntity createUser(String email, RoleNameEnum role) {
        UserEntity newUser = new UserEntity()
                .setDisabled(false)
                .setEmail(email)
                .setFirstName("Test user first")
                .setLastName("Test user last")
                .setUsername("username")
                .setRole(new RoleEntity().setRoleName(role));

        return userRepository.save(newUser);
    }

    public void cleanUp() {
        userRepository.deleteAll();
    }
}
