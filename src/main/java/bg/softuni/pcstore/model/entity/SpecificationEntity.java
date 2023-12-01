package bg.softuni.pcstore.model.entity;

import bg.softuni.pcstore.model.enums.CaseTypeEnum;
import bg.softuni.pcstore.model.enums.FormatEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "specifications")
public class SpecificationEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private CaseTypeEnum caseType;
    @Enumerated(EnumType.STRING)
    private FormatEnum format;
    private int fans;
    private int weight;

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

    public int getFans() {
        return fans;
    }

    public SpecificationEntity setFans(int fans) {
        this.fans = fans;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public SpecificationEntity setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    //TODO: Add the rest of specifications
}
