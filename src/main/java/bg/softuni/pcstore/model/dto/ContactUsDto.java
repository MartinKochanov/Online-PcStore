package bg.softuni.pcstore.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ContactUsDto {
    @NotBlank(message = "Required!")
    private String name;
    @Email(message = "Required!")
    @NotBlank(message = "Required!")
    private String email;
    @NotBlank(message = "Required!")
    private String text;

    public String getName() {
        return name;
    }

    public ContactUsDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactUsDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getText() {
        return text;
    }

    public ContactUsDto setText(String text) {
        this.text = text;
        return this;
    }
}
