package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.validation.FieldMatch;
import bg.softuni.pcstore.validation.UniqueUsername;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@FieldMatch(first = "password",
        second = "confirmPassword",
        message = "Password mismatch!")
public class UserRegisterDto {
    @NotNull
    @UniqueUsername
    @Size(min = 6, message = "Your username must contain at least 6 characters!")
    private String username;
    @NotBlank(message = "First name is required!")
    private String firstName;
    private String lastName;
    @NotBlank(message = "Email is required!")
    @Email
    private String email;
    @NotNull
    @Size(min = 8, message = "Password must contain at least 8 characters")
    private String password;
    private String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    public UserRegisterDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserRegisterDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterDto setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
