package bg.softuni.pcstore.model.enums;

public enum CaseTypeEnum {

    FULL_TOWER("Full Tower"),
    MID_TOWER("Mid Tower"),
    MINI_TOWER("Mini Tower"),
    DESKTOP("Desktop"),
    SFF("SFF (Small Form Factor)");

    private String name;


    CaseTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
