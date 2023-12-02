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

    public Integer getCapacity() {
        return capacity;
    }

    @Enumerated(EnumType.STRING)
    private ResolutionsEnum resolution;

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
