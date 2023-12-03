package bg.softuni.pcstore.model.enums;

public enum CoolerTypesEnum {
    AIR_COOLING("Air Cooling"),
    WATER_COOLING("Water Cooling");

    private String name;

    CoolerTypesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
