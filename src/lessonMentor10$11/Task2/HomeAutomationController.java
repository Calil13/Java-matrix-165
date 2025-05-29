package lessonMentor10$11.Task2;

public class HomeAutomationController {
    Device[] devices = new Device[10];
    int count = 0;

    void registerDevice(Device register) {
        devices[count++] = register;
        Logger.info(register, " registered.");
    }

    void turnOnAllDevices() {
        for (int i = 0; i < count; i++) {
            if (devices[i] instanceof AirConditioner ac) {
                ac.setIsOn(true);
                Logger.info(devices[i], ": ON");
            } else if (devices[i] instanceof Light l) {
                l.setIsOn(true);
                Logger.info(devices[i], ": ON");
            } else {
                throw new ValidationException("Device not found!");
            }
        }
    }

    void setDeviceTemperature(Device device, double temperature) {
        for (int i = 0; i < count; i++) {
            if (devices[i] instanceof AirConditioner ac) {
                ac.setTemperature(temperature);
                Logger.info(devices[i], " New temperature " + temperature + "°C");
            }
        }
    }

    void checkAllStatuses() {
        System.out.println("\nCheck devices: ");
        for (int i = 0; i < count; i++) {
            Logger.success(devices[i], " success registered!");
        }
    }
}