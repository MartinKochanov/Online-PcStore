package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.model.enums.ManufacturerEnum;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class ProductEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "type_product", nullable = false)
    private ProductTypeEnum typeProduct;

    @Enumerated(EnumType.STRING)
    @NotNull
    private ManufacturerEnum manufacturer;

    @NotNull
    private String model;
    @NotNull
    private BigDecimal price;
    @NotNull
    private String description;
    @OneToOne
    private SpecificationEntity specifications;

    public ProductTypeEnum getTypeProduct() {
        return typeProduct;
    }

    public ProductEntity setTypeProduct(ProductTypeEnum typeProduct) {
        this.typeProduct = typeProduct;
        return this;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public ProductEntity setManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public ProductEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public SpecificationEntity getSpecifications() {
        return specifications;
    }

    public ProductEntity setSpecifications(SpecificationEntity specifications) {
        this.specifications = specifications;
        return this;
    }
}
