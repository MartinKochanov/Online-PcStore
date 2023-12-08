package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.events.UserRegistrationEvent;
import bg.softuni.pcstore.exception.ObjectNotFoundException;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.model.entity.VerificationToken;
import bg.softuni.pcstore.repository.UserRepository;
import bg.softuni.pcstore.repository.VerificationTokenRepository;
import bg.softuni.pcstore.service.EmailService;
import bg.softuni.pcstore.service.UserActivationService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class UserActivationServiceImpl implements UserActivationService {
    private final EmailService emailService;
    private final VerificationTokenRepository verificationTokenRepository;
    private final UserRepository userRepository;


    public UserActivationServiceImpl(EmailService emailService, VerificationTokenRepository verificationTokenRepository, UserRepository userRepository) {
        this.emailService = emailService;
        this.verificationTokenRepository = verificationTokenRepository;
        this.userRepository = userRepository;
    }

    @EventListener(UserRegistrationEvent.class)
    @Override
    public void userRegistered(UserRegistrationEvent event) {
        String activationToken = createVerificationToken(event.getUsername());
        emailService.sendActivationEmail(event.getUserEmail(), event.getFullName(), activationToken);
    }

    @Override
    public String createVerificationToken(String username) {
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken();
        verificationToken
                .setToken(token)
                .setCreated(Instant.now())
                .setUser(userRepository.findByUsername(username).orElseThrow(() -> new ObjectNotFoundException("User not found!")));

        verificationTokenRepository.save(verificationToken);
        return token;
    }

    @Override
    public void cleanUpLinks() {
        if (verificationTokenRepository.count() <= 0) {
            return;
        }

        List<VerificationToken> all = verificationTokenRepository.findAll();

        all.forEach(token -> {
            boolean tokenExpired = token.getCreated().isBefore(Instant.now().minusSeconds(600));
            if (token.getUser().isDisabled() && tokenExpired) {
                UserEntity user = token.getUser();
                verificationTokenRepository.delete(token);
                userRepository.delete(user);
            }
            if (!token.getUser().isDisabled()) {
                verificationTokenRepository.delete(token);
            }
        });

    }
}
