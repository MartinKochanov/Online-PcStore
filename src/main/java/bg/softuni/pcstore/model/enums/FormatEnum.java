package bg.softuni.pcstore.model.enums;

public enum FormatEnum {
    ATX("Standard ATX"),
    MICRO_ATX("Micro ATX"),
    MINI_ITX("Mini ITX"),
    NANO_ITX("Nano ITX"),
    PICO_ITX("Pico ITX");

    FormatEnum(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public FormatEnum setName(String name) {
        this.name = name;
        return this;
    }
}
