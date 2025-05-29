package lessonMentor10$11.Task2;

public class DeviceStatusMonitor {
    Device[] devices = new Device[10];
    int count = 0;

    public void checkStatuses(Device device){
        devices[count++] = device;
        for (int i = 0; i < count; i++) {
            if (device instanceof AirConditioner ac){
                if (ac.getIsOn()){
                    Logger.info(ac, ": ON, Temperature: " + ac.getTemperature() + "°C");
                }else {
                    Logger.info(ac, ": OFF");
                }
            } else if (device instanceof Light l) {
                if (l.getIsOn()){
                    Logger.info(l, ": ON");
                }else {
                    Logger.info(l, ": OFF");
                }
            } else {
                System.out.println("Not Device!");
            }
        }
        count = 0;
    }
}