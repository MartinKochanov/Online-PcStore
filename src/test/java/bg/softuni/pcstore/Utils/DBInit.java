package bg.softuni.pcstore.Utils;

import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import bg.softuni.pcstore.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBInit implements CommandLineRunner {

  @Autowired
  private RoleRepository userRoleRepository;

  @Override
  public void run(String... args) throws Exception {
    if (userRoleRepository.count() == 0) {
      userRoleRepository.saveAll(List.of(
          new RoleEntity().setRoleName(RoleNameEnum.ADMIN),
          new RoleEntity().setRoleName(RoleNameEnum.USER)
      ));
    }
  }
}