package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.*;
import bg.softuni.pcstore.validation.UniqueModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class NewProductDTO {
    private String typeProduct;
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
    private Integer fans;
    @PositiveOrZero(message = "Weight cannot be negative!")
    private Integer weight;
    @Enumerated(EnumType.STRING)
    private CpuSocketTypesEnum cpuSocket;
    private Integer memorySlots;
    @PositiveOrZero
    private Integer maxMemory;
    @Enumerated(EnumType.STRING)
    private TypeMemoryEnum memoryType;

    @Enumerated(EnumType.STRING)
    private GraphicCardSlotsEnum graphicCardSlot;

    @Enumerated(EnumType.STRING)
    private VideoMemoryTypeEnum videoMemoryType;
    @PositiveOrZero
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    private ResolutionsEnum resolution;

    public ResolutionsEnum getResolution() {
        return resolution;
    }

    public NewProductDTO setResolution(ResolutionsEnum resolution) {
        this.resolution = resolution;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public NewProductDTO setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public VideoMemoryTypeEnum getVideoMemoryType() {
        return videoMemoryType;
    }

    public NewProductDTO setVideoMemoryType(VideoMemoryTypeEnum videoMemoryType) {
        this.videoMemoryType = videoMemoryType;
        return this;
    }

    public GraphicCardSlotsEnum getGraphicCardSlot() {
        return graphicCardSlot;
    }

    public NewProductDTO setGraphicCardSlot(GraphicCardSlotsEnum graphicCardSlot) {
        this.graphicCardSlot = graphicCardSlot;
        return this;
    }

    public Integer getMemorySlots() {
        return memorySlots;
    }

    public NewProductDTO setMemorySlots(Integer memorySlots) {
        this.memorySlots = memorySlots;
        return this;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public NewProductDTO setTypeProduct(String typeProduct) {
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

    public Integer getFans() {
        return fans;
    }

    public NewProductDTO setFans(Integer fans) {
        this.fans = fans;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public NewProductDTO setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public CpuSocketTypesEnum getCpuSocket() {
        return cpuSocket;
    }

    public NewProductDTO setCpuSocket(CpuSocketTypesEnum cpuSocket) {
        this.cpuSocket = cpuSocket;
        return this;
    }

    public Integer getMaxMemory() {
        return maxMemory;
    }

    public NewProductDTO setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    public TypeMemoryEnum getMemoryType() {
        return memoryType;
    }

    public NewProductDTO setMemoryType(TypeMemoryEnum memoryType) {
        this.memoryType = memoryType;
        return this;
    }
}
