package Task2;

public class LapTop extends Device{
    String name;
    DeviceType deviceType;

    @Override
    public void turnOn() {
        System.out.println(name + " is turning on...");
    }

    @Override
    public void turnOf() {
        System.out.println(name + " is turning off...");
    }

    public LapTop(String name, DeviceType deviceType) {
        this.name = name;
        this.deviceType = deviceType;
    }
}
