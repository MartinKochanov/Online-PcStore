package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.validation.UniqueUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @NotNull
    @Length(min = 6)
    @Column(unique = true)
    private String username;
    @NotNull
    private String firstName;
    private String lastName;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;
    private boolean disabled;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH})
    private Set<RoleEntity> roles;

    public UserEntity() {
        this.roles = new HashSet<>();
        this.disabled = true;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String first_name) {
        this.firstName = first_name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String last_name) {
        this.lastName = last_name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public UserEntity setDisabled(boolean disabled) {
        this.disabled = disabled;
        return this;
    }
}
