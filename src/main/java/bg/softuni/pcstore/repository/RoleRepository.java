package bg.softuni.pcstore.repository;

import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.enums.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByRoleName(RoleNameEnum roleNameEnum);
}
