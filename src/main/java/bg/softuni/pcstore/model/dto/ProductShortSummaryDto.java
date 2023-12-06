package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.ManufacturerEnum;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductShortSummaryDto {
    private ManufacturerEnum manufacturer;

    private String model;

    private BigDecimal price;

    private byte[] image;

    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public ProductShortSummaryDto setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public ProductShortSummaryDto setManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public ProductShortSummaryDto setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductShortSummaryDto setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public ProductShortSummaryDto setImage(byte[] image) {
        this.image = image;
        return this;
    }
    public String generateBase64Image() {
        return Base64.encodeBase64String(this.image);
    }
}
