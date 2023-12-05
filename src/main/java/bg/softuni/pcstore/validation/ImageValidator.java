package bg.softuni.pcstore.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

public class ImageValidator implements ConstraintValidator<Image, MultipartFile> {
    @Override
    public boolean isValid(MultipartFile value, ConstraintValidatorContext context) {
        return Objects.requireNonNull(value.getContentType()).matches("image/jpeg") ||
                Objects.requireNonNull(value.getContentType()).matches("image/png") ||
                Objects.requireNonNull(value.getContentType()).matches("image/webp");
    }
}
