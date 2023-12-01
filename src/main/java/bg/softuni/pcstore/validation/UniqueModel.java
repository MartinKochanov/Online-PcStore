package bg.softuni.pcstore.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = UniqueModelValidator.class)
public @interface UniqueModel {

    String message() default "This models already exists!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
