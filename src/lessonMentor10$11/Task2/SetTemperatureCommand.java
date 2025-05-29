package lessonMentor10$11.Task2;

import java.time.LocalDateTime;

public class SetTemperatureCommand implements Command {
    AirConditioner airConditioner;
    Device device;
    int temperature;

    public SetTemperatureCommand(Device device, int temperature) {
        this.device = device;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        if (device instanceof AirConditioner ac) {
            ac.setTemperature(temperature);
            Logger.info(device, " Temperature: " + temperature + "°C");
        } else {
            Logger.error(device);
        }
    }
}
