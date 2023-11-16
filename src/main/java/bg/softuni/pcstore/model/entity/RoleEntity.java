package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.model.enums.RoleNameEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{


    @Column(unique = true)
    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleNameEnum roleName;

    public RoleNameEnum getRoleName() {
        return roleName;
    }

    public RoleEntity setRoleName(RoleNameEnum roleName) {
        this.roleName = roleName;
        return this;
    }
}
