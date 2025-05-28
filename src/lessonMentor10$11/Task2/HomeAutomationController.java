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

    }

    void setDeviceTemperature() {

    }

    void checkAllStatuses() {
        System.out.println("\nCheck devices: ");
        for (int i = 0; i < count; i++) {
            Logger.success(devices[i], " success registered!");
        }
    }
}
