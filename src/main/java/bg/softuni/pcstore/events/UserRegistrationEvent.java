package bg.softuni.pcstore.events;

import org.springframework.context.ApplicationEvent;
public class UserRegistrationEvent extends ApplicationEvent {

    private final String fullName;
    private final String userEmail;
    private final String username;

    public UserRegistrationEvent(Object source, String fullName, String userEmail, String username) {
        super(source);
        this.fullName = fullName;
        this.userEmail = userEmail;
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserEmail() {
        return userEmail;
    }


    public String getUsername() {
    return username;
    }

}
