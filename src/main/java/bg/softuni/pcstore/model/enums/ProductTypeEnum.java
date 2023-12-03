package bg.softuni.pcstore.model.enums;

public enum ProductTypeEnum {
    CASE,
    MOTHERBOARD,
    CPU,
    COOLER,
    SSD,
    HDD,
    RAM,
    POWER_SUPPLY,
    FAN,
    GRAPHIC_CARD,
    M2SSD,
    MOUSE,
    KEYBOARD;

    public static boolean contains(String product) {

        for (ProductTypeEnum v  : ProductTypeEnum.values()) {
            if (v.name().equals(product)) {
                return true;
            }
        }
        return false;
    }
}
