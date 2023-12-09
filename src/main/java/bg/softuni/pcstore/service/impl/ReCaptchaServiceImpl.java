package bg.softuni.pcstore.service.impl;

import java.net.URI;
import java.util.Optional;

import bg.softuni.pcstore.config.RecaptchaConfig;
import bg.softuni.pcstore.model.dto.ReCaptchaResponseDto;
import bg.softuni.pcstore.service.ReCaptchaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

@Service
public class ReCaptchaServiceImpl implements ReCaptchaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReCaptchaServiceImpl.class);

    private final WebClient webClient;

    private final RecaptchaConfig recaptchaConfig;

    public ReCaptchaServiceImpl(WebClient webClient, RecaptchaConfig recaptchaConfig) {
        this.webClient = webClient;
        this.recaptchaConfig = recaptchaConfig;
    }

    @Override
    public Optional<ReCaptchaResponseDto> verify(String token) {
        ReCaptchaResponseDto response = webClient
                .post()
                .uri(this::buildReCaptchaURI)
                .body(BodyInserters
                        .fromFormData("secret", recaptchaConfig.getSecret())
                        .with("response", token))
                .retrieve()
                .bodyToMono(ReCaptchaResponseDto.class)
                .doOnError(t -> LOGGER.error("Error fetching google response...", t))
                .onErrorComplete()
                .block();

        return Optional.ofNullable(response);
    }

    private URI buildReCaptchaURI(UriBuilder uriBuilder) {
        //  https://google.com/recaptcha/api/siteverify
        return uriBuilder
                .scheme("https")
                .host("google.com")
                .path("/recaptcha/api/siteverify")
                .build();
    }
}
