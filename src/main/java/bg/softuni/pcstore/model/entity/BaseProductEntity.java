package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.model.enums.ManufacturerNameEnum;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class BaseProductEntity {
    @NotNull
    private ProductTypeEnum type;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @NotNull
    private ManufacturerNameEnum manufacturer;
    @NotNull
    private String model;

    private String description;

    private String color;

    private Long quantity;

    public Long getQuantity() {
        return quantity;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public BaseProductEntity setType(ProductTypeEnum type) {
        this.type = type;
        return this;
    }

    public BaseProductEntity setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public Long getId() {
        return id;
    }

    public BaseProductEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public ManufacturerNameEnum getManufacturer() {
        return manufacturer;
    }

    public BaseProductEntity setManufacturer(ManufacturerNameEnum manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public BaseProductEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BaseProductEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getColor() {
        return color;
    }

    public BaseProductEntity setColor(String color) {
        this.color = color;
        return this;
    }

    public String shortDescription() {
        return this.manufacturer + " " + this.model + " " + this.color;
    }
}
