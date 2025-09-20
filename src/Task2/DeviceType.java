package Task2;

public enum DeviceType {
    PHONE("This is a mobile phone"),
    LAPTOP("This is a laptop"),
    SMARTWATCH("This is a smart watch");

    private final String description;


    DeviceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
