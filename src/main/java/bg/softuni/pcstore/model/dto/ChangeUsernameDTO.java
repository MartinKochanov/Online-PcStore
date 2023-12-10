package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.validation.FieldMatch;
import bg.softuni.pcstore.validation.UniqueUsername;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@FieldMatch(
        first = "password",
        second = "confirmPassword",
        message = "Password mismatch!"
)
public class ChangeUsernameDTO {
    @NotNull
    @Size(min = 6, message = "Username must be at least 6 characters!")
    @UniqueUsername
    private String newUsername;

    private String password;

    private String confirmPassword;

    public String getNewUsername() {
        return newUsername;
    }

    public ChangeUsernameDTO setNewUsername(String newUsername) {
        this.newUsername = newUsername;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ChangeUsernameDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public ChangeUsernameDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
