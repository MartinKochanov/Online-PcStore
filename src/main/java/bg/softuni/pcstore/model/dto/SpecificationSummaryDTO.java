package bg.softuni.pcstore.model.dto;

import bg.softuni.pcstore.model.enums.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class SpecificationSummaryDTO {
    @Enumerated(EnumType.STRING)
    private CaseTypeEnum caseType;
    @Enumerated(EnumType.STRING)
    private FormatEnum format;
    private Integer fans;
    private Double weight;
    @Enumerated(EnumType.STRING)
    private CpuSocketTypesEnum cpuSocket;

    private Integer memorySlots;

    private Integer maxMemory;
    @Enumerated(EnumType.STRING)
    private TypeMemoryEnum memoryType;
    @Enumerated(EnumType.STRING)
    private GraphicCardSlotsEnum graphicCardSlot;
    @Enumerated(EnumType.STRING)
    private VideoMemoryTypeEnum videoMemoryType;

    private Integer capacity;

    private Integer power;

    private Integer efficiency;

    @Enumerated(EnumType.STRING)
    private DrivesInterfacesEnum driveInterface;
    @Enumerated(EnumType.STRING)
    private SsdTypesEnum ssdType;


    private Integer readSpeed;


    private Integer writeSpeed;

    private Integer dpi;


    private Integer buttons;
    @Enumerated(EnumType.STRING)
    private ColorEnum color;

    @Enumerated(EnumType.STRING)
    private ConnectivityEnum connectivity;

    @Enumerated(EnumType.STRING)
    private ResolutionsEnum resolution;

    private Integer cashMemory;

    private Double frequency;

    private Double boost;

    private Integer cores;

    private Integer threads;

    private Integer rotationSpeed;

    @Enumerated(EnumType.STRING)
    private CoolerTypesEnum coolingType;

    public CaseTypeEnum getCaseType() {
        return caseType;
    }

    public SpecificationSummaryDTO setCaseType(CaseTypeEnum caseType) {
        this.caseType = caseType;
        return this;
    }

    public FormatEnum getFormat() {
        return format;
    }

    public SpecificationSummaryDTO setFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    public Integer getFans() {
        return fans;
    }

    public SpecificationSummaryDTO setFans(Integer fans) {
        this.fans = fans;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public SpecificationSummaryDTO setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public CpuSocketTypesEnum getCpuSocket() {
        return cpuSocket;
    }

    public SpecificationSummaryDTO setCpuSocket(CpuSocketTypesEnum cpuSocket) {
        this.cpuSocket = cpuSocket;
        return this;
    }

    public Integer getMemorySlots() {
        return memorySlots;
    }

    public SpecificationSummaryDTO setMemorySlots(Integer memorySlots) {
        this.memorySlots = memorySlots;
        return this;
    }

    public Integer getMaxMemory() {
        return maxMemory;
    }

    public SpecificationSummaryDTO setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    public TypeMemoryEnum getMemoryType() {
        return memoryType;
    }

    public SpecificationSummaryDTO setMemoryType(TypeMemoryEnum memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    public GraphicCardSlotsEnum getGraphicCardSlot() {
        return graphicCardSlot;
    }

    public SpecificationSummaryDTO setGraphicCardSlot(GraphicCardSlotsEnum graphicCardSlot) {
        this.graphicCardSlot = graphicCardSlot;
        return this;
    }

    public VideoMemoryTypeEnum getVideoMemoryType() {
        return videoMemoryType;
    }

    public SpecificationSummaryDTO setVideoMemoryType(VideoMemoryTypeEnum videoMemoryType) {
        this.videoMemoryType = videoMemoryType;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public SpecificationSummaryDTO setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public Integer getPower() {
        return power;
    }

    public SpecificationSummaryDTO setPower(Integer power) {
        this.power = power;
        return this;
    }

    public Integer getEfficiency() {
        return efficiency;
    }

    public SpecificationSummaryDTO setEfficiency(Integer efficiency) {
        this.efficiency = efficiency;
        return this;
    }

    public DrivesInterfacesEnum getDriveInterface() {
        return driveInterface;
    }

    public SpecificationSummaryDTO setDriveInterface(DrivesInterfacesEnum driveInterface) {
        this.driveInterface = driveInterface;
        return this;
    }

    public SsdTypesEnum getSsdType() {
        return ssdType;
    }

    public SpecificationSummaryDTO setSsdType(SsdTypesEnum ssdType) {
        this.ssdType = ssdType;
        return this;
    }

    public Integer getReadSpeed() {
        return readSpeed;
    }

    public SpecificationSummaryDTO setReadSpeed(Integer readSpeed) {
        this.readSpeed = readSpeed;
        return this;
    }

    public Integer getWriteSpeed() {
        return writeSpeed;
    }

    public SpecificationSummaryDTO setWriteSpeed(Integer writeSpeed) {
        this.writeSpeed = writeSpeed;
        return this;
    }

    public Integer getDpi() {
        return dpi;
    }

    public SpecificationSummaryDTO setDpi(Integer dpi) {
        this.dpi = dpi;
        return this;
    }

    public Integer getButtons() {
        return buttons;
    }

    public SpecificationSummaryDTO setButtons(Integer buttons) {
        this.buttons = buttons;
        return this;
    }

    public ColorEnum getColor() {
        return color;
    }

    public SpecificationSummaryDTO setColor(ColorEnum color) {
        this.color = color;
        return this;
    }

    public ConnectivityEnum getConnectivity() {
        return connectivity;
    }

    public SpecificationSummaryDTO setConnectivity(ConnectivityEnum connectivity) {
        this.connectivity = connectivity;
        return this;
    }

    public ResolutionsEnum getResolution() {
        return resolution;
    }

    public SpecificationSummaryDTO setResolution(ResolutionsEnum resolution) {
        this.resolution = resolution;
        return this;
    }

    public Integer getCashMemory() {
        return cashMemory;
    }

    public SpecificationSummaryDTO setCashMemory(Integer cashMemory) {
        this.cashMemory = cashMemory;
        return this;
    }

    public Double getFrequency() {
        return frequency;
    }

    public SpecificationSummaryDTO setFrequency(Double frequency) {
        this.frequency = frequency;
        return this;
    }

    public Double getBoost() {
        return boost;
    }

    public SpecificationSummaryDTO setBoost(Double boost) {
        this.boost = boost;
        return this;
    }

    public Integer getCores() {
        return cores;
    }

    public SpecificationSummaryDTO setCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    public Integer getThreads() {
        return threads;
    }

    public SpecificationSummaryDTO setThreads(Integer threads) {
        this.threads = threads;
        return this;
    }

    public Integer getRotationSpeed() {
        return rotationSpeed;
    }

    public SpecificationSummaryDTO setRotationSpeed(Integer rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
        return this;
    }

    public CoolerTypesEnum getCoolingType() {
        return coolingType;
    }

    public SpecificationSummaryDTO setCoolingType(CoolerTypesEnum coolingType) {
        this.coolingType = coolingType;
        return this;
    }
}
