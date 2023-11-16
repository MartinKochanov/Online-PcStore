package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.model.enums.CategoryEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {
    @NotNull
    @Enumerated(EnumType.STRING)
    private CategoryEnum name;


    public CategoryEnum getName() {
        return name;
    }

    public CategoryEntity setName(CategoryEnum name) {
        this.name = name;
        return this;
    }
}
