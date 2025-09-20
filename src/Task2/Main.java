package Task2;

public class Main {
    public static void main(String[] args) {
        Device phone = new Phone("iPhone 13", DeviceType.PHONE);
        Device laptop = new LapTop("MacBook Pro", DeviceType.LAPTOP);

        phone.turnOn();
        laptop.turnOf();

        DeviceInspector.inspect(phone);
    }
}
