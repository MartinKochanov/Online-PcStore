package bg.softuni.pcstore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "google.recaptcha")
public class RecaptchaConfig {

    private String key;
    private String secret;

    public String getKey() {
        return key;
    }

    public RecaptchaConfig setKey(String key) {
        this.key = key;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public RecaptchaConfig setSecret(String secret) {
        this.secret = secret;
        return this;
    }
}
