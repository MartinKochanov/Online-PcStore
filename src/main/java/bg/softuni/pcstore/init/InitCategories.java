package bg.softuni.pcstore.init;

import bg.softuni.pcstore.model.entity.CategoryEntity;
import bg.softuni.pcstore.model.enums.CategoryEnum;
import bg.softuni.pcstore.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitCategories implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public InitCategories(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        if (categoryRepository.count() > 0) {
            return;
        }

        Set<CategoryEntity> categories = new HashSet<>();

        Arrays.stream(CategoryEnum.values()).forEach(categoryEnum -> {
            CategoryEntity category = new CategoryEntity().setName(categoryEnum);
            categories.add(category);
        });

        categoryRepository.saveAll(categories);
    }
}
