package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.ManufacturerEnum;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDetailsDTO {
    private ManufacturerEnum manufacturer;

    private String model;

    private BigDecimal price;

    private byte[] image;

    private UUID uuid;

    private String description;

    private SpecificationSummaryDTO specifications;

    public String getDescription() {
        return description;
    }

    public ProductDetailsDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public ProductDetailsDTO setManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public ProductDetailsDTO setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductDetailsDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public ProductDetailsDTO setImage(byte[] image) {
        this.image = image;
        return this;
    }

    public UUID getUuid() {
        return uuid;
    }

    public ProductDetailsDTO setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public SpecificationSummaryDTO getSpecifications() {
        return specifications;
    }

    public ProductDetailsDTO setSpecifications(SpecificationSummaryDTO specifications) {
        this.specifications = specifications;
        return this;
    }
    public String generateBase64Image() {
        return Base64.encodeBase64String(this.image);
    }
    public String productShortDescription() {
        return this.manufacturer.name() + " " + this.model + " ";
    }
}
