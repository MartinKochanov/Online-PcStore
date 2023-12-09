package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.ReCaptchaResponseDto;

import java.util.Optional;

public interface ReCaptchaService {

     Optional<ReCaptchaResponseDto> verify(String token);
}
