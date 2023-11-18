package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EmailServiceImpl implements EmailService {

    private final TemplateEngine templateEngine;
    private final JavaMailSender javaMailSender;
    private final String myEmail;

    public EmailServiceImpl(TemplateEngine templateEngine,
                            JavaMailSender javaMailSender,
                            @Value("${mail.username}") String myEmail) {
        this.templateEngine = templateEngine;
        this.javaMailSender = javaMailSender;
        this.myEmail = myEmail;
    }

    @Override
    public void sendActivationEmail(String userEmail, String fullName, String activationToken) {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);

        try {
            mimeMessageHelper.setTo(userEmail);
            mimeMessageHelper.setFrom(myEmail);
            mimeMessageHelper.setReplyTo(myEmail);
            mimeMessageHelper.setSubject("Welcome to Gamer Hub!");
            mimeMessageHelper.setText(generateRegistrationEmailBody(fullName, activationToken), true);

            javaMailSender.send(mimeMessageHelper.getMimeMessage());

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private String generateRegistrationEmailBody(String fullName, String activationToken) {

        Context context = new Context();
        context.setVariable("fullName", fullName);
        context.setVariable("token", activationToken);

        return templateEngine.process("email/registration-email", context);
    }
}
