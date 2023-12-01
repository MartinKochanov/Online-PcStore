package bg.softuni.pcstore.validation;

import bg.softuni.pcstore.repository.ProductRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueModelValidator implements ConstraintValidator<UniqueModel, String> {

    private final ProductRepository productRepository;

    public UniqueModelValidator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return productRepository.findByModel(value).isEmpty();
    }
}
