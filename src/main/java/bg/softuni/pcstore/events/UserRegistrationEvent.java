package bg.softuni.pcstore.events;

import org.springframework.context.ApplicationEvent;
public class UserRegistrationEvent extends ApplicationEvent {

    private final String username;
    private final String userEmail;

    public UserRegistrationEvent(Object source, String username, String userEmail) {
        super(source);
        this.username = username;
        this.userEmail = userEmail;
    }

    public String getUsername() {
        return username;
    }

    public String getUserEmail() {
        return userEmail;
    }


}
