package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.ColorEnum;
import bg.softuni.pcstore.model.enums.*;
import bg.softuni.pcstore.validation.UniqueModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.web.multipart.MultipartFile;

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
    @PositiveOrZero(message = "Slots cannot be negative!")
    private Integer memorySlots;
    @PositiveOrZero(message = "Memory cannot be negative!")
    private Integer maxMemory;
    @Enumerated(EnumType.STRING)
    private TypeMemoryEnum memoryType;

    @Enumerated(EnumType.STRING)
    private GraphicCardSlotsEnum graphicCardSlot;

    @Enumerated(EnumType.STRING)
    private VideoMemoryTypeEnum videoMemoryType;
    @PositiveOrZero(message = "Capacity cannot be negative!")
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    private ResolutionsEnum resolution;
    @PositiveOrZero(message = "Cash Memory cannot be negative!")
    private Integer cashMemory;
    @PositiveOrZero(message = "Frequency cannot be negative!")
    private Double frequency;
    @PositiveOrZero(message = "Boost cannot be negative!")
    private Double boost;
    @PositiveOrZero(message = "Cores cannot be negative!")
    private Integer cores;
    @PositiveOrZero(message = "Threads cannot be negative!")
    private Integer threads;
    @Enumerated(EnumType.STRING)
    private CoolerTypesEnum coolingType;
    @PositiveOrZero(message = "Rotation speed cannot be negative!")
    private Integer rotationSpeed;
    @PositiveOrZero(message = "Power cannot be negative!")
    private Integer power;
    @PositiveOrZero(message = "Efficiency cannot be negative!")
    private Integer efficiency;
    @Enumerated(EnumType.STRING)
    private SsdTypesEnum ssdType;
    @Enumerated(EnumType.STRING)
    private DrivesInterfacesEnum drivesInterface;

    @PositiveOrZero(message = "Read speed cannot be negative!")
    private Integer readSpeed;

    @PositiveOrZero(message = "Write speed cannot be negative!")
    private Integer writeSpeed;

    @PositiveOrZero(message = "Dpi cannot be negative!")
    private Integer dpi;

    @PositiveOrZero(message = "Buttons cannot be negative!")
    private Integer buttons;

    @Enumerated(EnumType.STRING)
    private ColorEnum color;

    @Enumerated(EnumType.STRING)
    private ConnectivityEnum connectivity;

    private MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public NewProductDTO setImage(MultipartFile image) {
        this.image = image;
        return this;
    }

    public ConnectivityEnum getConnectivity() {
        return connectivity;
    }

    public NewProductDTO setConnectivity(ConnectivityEnum connectivity) {
        this.connectivity = connectivity;
        return this;
    }

    public ColorEnum getColor() {
        return color;
    }

    public NewProductDTO setColor(ColorEnum color) {
        this.color = color;
        return this;
    }

    public Integer getDpi() {
        return dpi;
    }

    public NewProductDTO setDpi(Integer dpi) {
        this.dpi = dpi;
        return this;
    }

    public Integer getButtons() {
        return buttons;
    }

    public NewProductDTO setButtons(Integer buttons) {
        this.buttons = buttons;
        return this;
    }

    public DrivesInterfacesEnum getDrivesInterface() {
        return drivesInterface;
    }

    public NewProductDTO setDrivesInterface(DrivesInterfacesEnum drivesInterface) {
        this.drivesInterface = drivesInterface;
        return this;
    }

    public Integer getReadSpeed() {
        return readSpeed;
    }
    public NewProductDTO setReadSpeed(Integer readSpeed) {
        this.readSpeed = readSpeed;
        return this;
    }

    public Integer getWriteSpeed() {
        return writeSpeed;
    }

    public NewProductDTO setWriteSpeed(Integer writeSpeed) {
        this.writeSpeed = writeSpeed;
        return this;
    }

    public SsdTypesEnum getSsdType() {
        return ssdType;
    }

    public NewProductDTO setSsdType(SsdTypesEnum ssdType) {
        this.ssdType = ssdType;
        return this;
    }

    @Enumerated(EnumType.STRING)
    private DrivesInterfacesEnum driveInterface;

    public DrivesInterfacesEnum getDriveInterface() {
        return driveInterface;
    }

    public NewProductDTO setDriveInterface(DrivesInterfacesEnum driveInterface) {
        this.driveInterface = driveInterface;
        return this;
    }

    public Integer getEfficiency() {
        return efficiency;
    }

    public NewProductDTO setEfficiency(Integer efficiency) {
        this.efficiency = efficiency;
        return this;
    }

    public Integer getPower() {
        return power;
    }

    public NewProductDTO setPower(Integer power) {
        this.power = power;
        return this;
    }

    public Integer getRotationSpeed() {
        return rotationSpeed;
    }

    public NewProductDTO setRotationSpeed(Integer rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
        return this;
    }

    public CoolerTypesEnum getCoolingType() {
        return coolingType;
    }

    public NewProductDTO setCoolingType(CoolerTypesEnum coolingType) {
        this.coolingType = coolingType;
        return this;
    }

    public Double getBoost() {
        return boost;
    }

    public NewProductDTO setBoost(Double boost) {
        this.boost = boost;
        return this;
    }

    public Integer getCores() {
        return cores;
    }

    public NewProductDTO setCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    public Integer getThreads() {
        return threads;
    }

    public NewProductDTO setThreads(Integer threads) {
        this.threads = threads;
        return this;
    }

    public Integer getCashMemory() {
        return cashMemory;
    }

    public NewProductDTO setCashMemory(Integer cashMemory) {
        this.cashMemory = cashMemory;
        return this;
    }

    public Double getFrequency() {
        return frequency;
    }

    public NewProductDTO setFrequency(Double frequency) {
        this.frequency = frequency;
        return this;
    }

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
