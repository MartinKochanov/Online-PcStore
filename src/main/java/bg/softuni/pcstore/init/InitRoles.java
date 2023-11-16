package bg.softuni.pcstore.init;

import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import bg.softuni.pcstore.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitRoles implements CommandLineRunner {
    private final RoleRepository roleRepository;

    public InitRoles(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (roleRepository.count() > 0) {
            return;
        }
        Set<RoleEntity> roles = new HashSet<>();
        Arrays.stream(RoleNameEnum.values()).forEach(role -> {
            RoleEntity roleEntity = new RoleEntity().setRoleName(role);
            roles.add(roleEntity);
        });

        roleRepository.saveAll(roles);
    }
}
