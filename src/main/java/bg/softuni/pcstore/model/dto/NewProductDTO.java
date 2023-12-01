package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.CaseTypeEnum;
import bg.softuni.pcstore.model.enums.FormatEnum;
import bg.softuni.pcstore.model.enums.ManufacturerEnum;
import bg.softuni.pcstore.model.enums.ProductTypeEnum;
import bg.softuni.pcstore.validation.UniqueModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class NewProductDTO {
    @Enumerated(EnumType.STRING)
    @NotNull
    private ProductTypeEnum typeProduct;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Manufacturer was not selected!")
    private ManufacturerEnum manufacturer;
    @NotBlank(message = "Model was not defined!")
    @UniqueModel
    private String model;
    @NotNull(message = "Price was not defined!")
    private BigDecimal price;
    @NotNull(message = "Description was not defined!")
    private String description;
    @Enumerated(EnumType.STRING)
    private CaseTypeEnum caseType;
    @Enumerated(EnumType.STRING)
    private FormatEnum format;
    @PositiveOrZero(message = "Fans cannot be negative!")
    private int fans;
    @PositiveOrZero(message = "Weight cannot be negative!")
    private int weight;

    public ProductTypeEnum getTypeProduct() {
        return typeProduct;
    }

    public NewProductDTO setTypeProduct(ProductTypeEnum typeProduct) {
        this.typeProduct = typeProduct;
        return this;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public NewProductDTO setManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public NewProductDTO setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public NewProductDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public NewProductDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public CaseTypeEnum getCaseType() {
        return caseType;
    }

    public NewProductDTO setCaseType(CaseTypeEnum caseType) {
        this.caseType = caseType;
        return this;
    }

    public FormatEnum getFormat() {
        return format;
    }

    public NewProductDTO setFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    public int getFans() {
        return fans;
    }

    public NewProductDTO setFans(int fans) {
        this.fans = fans;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public NewProductDTO setWeight(int weight) {
        this.weight = weight;
        return this;
    }
    //TODO: Add the rest of the specifications
}
