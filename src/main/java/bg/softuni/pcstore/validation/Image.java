package bg.softuni.pcstore.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ImageValidator.class)
public @interface Image {


    String message() default "Incorrect file type!\nSupported files types: .png, .jpeg, .webp";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
