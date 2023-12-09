package bg.softuni.pcstore.model.enums;

public enum ResolutionsEnum {
    nHD("640 x 360"),
    qHD("960 x 540"),
    HD("1280 x 720"),
    HD2("1280 x 1080"),
    HD_PLUS("1600 x 900"),
    FHD("1920 x 1080"),
    DCI2K("2048 x 1080"),
    FOURK("2160 x 1080"),
    THANOS("7680 x 4320");


    private String resolution;

    ResolutionsEnum(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

}
