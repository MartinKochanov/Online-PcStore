package bg.softuni.pcstore.model.enums;

public enum SsdTypesEnum {

    TWO5INCHES("2.5\""),
    M2("M.2"),
    MSATA("mSATA"),
    U2("U.2");

    private String name;

    SsdTypesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
