package bg.softuni.pcstore.service;

public interface EmailService {
    void sendActivationEmail(String userEmail, String username, String activationToken);

    void sendContactUsEmail(String userEmail, String fullName, String text);
}
