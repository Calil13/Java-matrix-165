package lessonMentor10$11.Task2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HomeAutomationController {
    Device[] devices = new Device[10];
    int count = 0;

    void registerDevice(Device register) {
        devices[count++] = Logger.info(register, " registered.");
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

    void setDeviceTemperature() {

    }

    void checkAllStatuses() {
        System.out.println("\nCheck devices: ");
        for (int i = 0; i < count; i++) {
            Logger.success(devices[i], " success registered!");
        }
        throw new ValidationException("Failed to register!");
    }
}
