package bg.softuni.pcstore.service;

import bg.softuni.pcstore.events.UserRegistrationEvent;

public interface UserActivationService {
    void userRegistered(UserRegistrationEvent event);

    String createVerificationToken(String username);
}
