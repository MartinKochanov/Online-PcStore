package bg.softuni.pcstore.model.dto;

import java.util.Set;

public class UserShortSummaryDTO {

    private String username;

    private String firstName;

    private String role;


    public String getUsername() {
        return username;
    }

    public UserShortSummaryDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserShortSummaryDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public UserShortSummaryDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserShortSummaryDTO setRole(String role) {
        this.role = role;
        return this;
    }
}
