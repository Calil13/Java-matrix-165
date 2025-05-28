package lessonMentor10$11.Task2;

public class Main {
    public static void main(String[] args) {
        HomeAutomationController controller = new HomeAutomationController();

        Device light = new Light("Hall Light");
        AirConditioner ac = new AirConditioner("Bedroom AC");

        controller.registerDevice(light);
        controller.registerDevice(ac);

        Command turnOnLight = new TurnOnCommand(light);
        Command turnOnAC = new TurnOnCommand(ac);
        Command setTemp = new SetTemperatureCommand(ac, 21);
        Command offLight = new TurnOffCommand(light);

        turnOnLight.execute();
        turnOnAC.execute();
        setTemp.execute();
        offLight.execute();

        controller.checkAllStatuses();

        DeviceStatusMonitor monitor = new DeviceStatusMonitor();
        monitor.addDevice(light);
        monitor.addDevice(ac);
        monitor.checkStatuses();
    }
}
