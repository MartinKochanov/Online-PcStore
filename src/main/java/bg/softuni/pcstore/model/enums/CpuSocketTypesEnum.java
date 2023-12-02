package bg.softuni.pcstore.model.enums;

public enum CpuSocketTypesEnum {
    G2("G2"),
    FM1("FM1"),
    AM3_PLUS("AM3+"),
    AM1("AM1"),
    AM3("AM3"),
    AM4("AM4"),
    AM5("AM5"),
    LGA1700("LGA 1700"),
    LGA1200("LGA 1200"),
    LGA1151("LGA 1151")
    ;


    private String name;

    CpuSocketTypesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
