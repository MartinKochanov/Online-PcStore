package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.model.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "specifications")
public class SpecificationEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private CaseTypeEnum caseType;
    @Enumerated(EnumType.STRING)
    private FormatEnum format;
    private Integer fans;
    private Integer weight;
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
    @PositiveOrZero
    private Integer capacity;
    @PositiveOrZero
    private Integer power;

    @PositiveOrZero
    private Integer efficiency;

    @Enumerated(EnumType.STRING)
    private DrivesInterfacesEnum driveInterface;
    @Enumerated(EnumType.STRING)
    private SsdTypesEnum ssdType;

    @PositiveOrZero
    private Integer readSpeed;

    @PositiveOrZero
    private Integer writeSpeed;

    public DrivesInterfacesEnum getDriveInterface() {
        return driveInterface;
    }

    public SpecificationEntity setDriveInterface(DrivesInterfacesEnum driveInterface) {
        this.driveInterface = driveInterface;
        return this;
    }

    public Integer getReadSpeed() {
        return readSpeed;
    }

    public SpecificationEntity setReadSpeed(Integer readSpeed) {
        this.readSpeed = readSpeed;
        return this;
    }

    public Integer getWriteSpeed() {
        return writeSpeed;
    }

    public SpecificationEntity setWriteSpeed(Integer writeSpeed) {
        this.writeSpeed = writeSpeed;
        return this;
    }

    public SsdTypesEnum getSsdType() {
        return ssdType;
    }

    public SpecificationEntity setSsdType(SsdTypesEnum ssdType) {
        this.ssdType = ssdType;
        return this;
    }


    public Integer getEfficiency() {
        return efficiency;
    }

    public SpecificationEntity setEfficiency(Integer efficiency) {
        this.efficiency = efficiency;
        return this;
    }

    public Integer getPower() {
        return power;
    }

    public SpecificationEntity setPower(Integer power) {
        this.power = power;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Enumerated(EnumType.STRING)
    private ResolutionsEnum resolution;
    @PositiveOrZero
    private Integer cashMemory;
    @PositiveOrZero
    private Double frequency;
    @PositiveOrZero
    private Double boost;
    @PositiveOrZero
    private Integer cores;
    @PositiveOrZero
    private Integer threads;
    @PositiveOrZero
    private Integer rotationSpeed;

    public Integer getRotationSpeed() {
        return rotationSpeed;
    }

    public SpecificationEntity setRotationSpeed(Integer rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
        return this;
    }

    @Enumerated(EnumType.STRING)
    private CoolerTypesEnum coolingType;

    public CoolerTypesEnum getCoolingType() {
        return coolingType;
    }

    public SpecificationEntity setCoolingType(CoolerTypesEnum coolingType) {
        this.coolingType = coolingType;
        return this;
    }

    public Double getBoost() {
        return boost;
    }

    public SpecificationEntity setBoost(Double boost) {
        this.boost = boost;
        return this;
    }

    public Integer getCores() {
        return cores;
    }

    public SpecificationEntity setCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    public Integer getThreads() {
        return threads;
    }

    public SpecificationEntity setThreads(Integer threads) {
        this.threads = threads;
        return this;
    }

    public Integer getCashMemory() {
        return cashMemory;
    }


    public SpecificationEntity setCashMemory(Integer cashMemory) {
        this.cashMemory = cashMemory;
        return this;
    }

    public Double getFrequency() {
        return frequency;
    }

    public SpecificationEntity setFrequency(Double frequency) {
        this.frequency = frequency;
        return this;
    }

    public ResolutionsEnum getResolution() {
        return resolution;
    }

    public SpecificationEntity setResolution(ResolutionsEnum resolution) {
        this.resolution = resolution;
        return this;
    }

    public SpecificationEntity setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public VideoMemoryTypeEnum getVideoMemoryType() {
        return videoMemoryType;
    }

    public SpecificationEntity setVideoMemoryType(VideoMemoryTypeEnum videoMemoryType) {
        this.videoMemoryType = videoMemoryType;
        return this;
    }

    public GraphicCardSlotsEnum getGraphicCardSlot() {
        return graphicCardSlot;
    }

    public SpecificationEntity setGraphicCardSlot(GraphicCardSlotsEnum graphicCardSlot) {
        this.graphicCardSlot = graphicCardSlot;
        return this;
    }

    public CaseTypeEnum getCaseType() {
        return caseType;
    }

    public SpecificationEntity setCaseType(CaseTypeEnum caseType) {
        this.caseType = caseType;
        return this;
    }

    public FormatEnum getFormat() {
        return format;
    }

    public SpecificationEntity setFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    public Integer getFans() {
        return fans;
    }

    public SpecificationEntity setFans(Integer fans) {
        this.fans = fans;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public SpecificationEntity setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public CpuSocketTypesEnum getCpuSocket() {
        return cpuSocket;
    }

    public SpecificationEntity setCpuSocket(CpuSocketTypesEnum cpuSocket) {
        this.cpuSocket = cpuSocket;
        return this;
    }

    public Integer getMaxMemory() {
        return maxMemory;
    }

    public SpecificationEntity setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    public Integer getMemorySlots() {
        return memorySlots;
    }

    public SpecificationEntity setMemorySlots(Integer memorySlots) {
        this.memorySlots = memorySlots;
        return this;
    }

    public TypeMemoryEnum getMemoryType() {
        return memoryType;
    }

    public SpecificationEntity setMemoryType(TypeMemoryEnum memoryType) {
        this.memoryType = memoryType;
        return this;
    }
    //TODO: Add the rest of specifications
}
