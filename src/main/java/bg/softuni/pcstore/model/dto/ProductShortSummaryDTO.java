package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.ManufacturerEnum;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductShortSummaryDTO {
    private ManufacturerEnum manufacturer;

    private String model;

    private BigDecimal price;

    private byte[] image;

    private UUID uuid;


    public UUID getUuid() {
        return uuid;
    }

    public ProductShortSummaryDTO setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public ProductShortSummaryDTO setManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public ProductShortSummaryDTO setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductShortSummaryDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public ProductShortSummaryDTO setImage(byte[] image) {
        this.image = image;
        return this;
    }
    public String generateBase64Image() {
        return Base64.encodeBase64String(this.image);
    }
    public String productShortDescription() {
        return this.manufacturer.name() + " " + this.model + " ";
    }
}
