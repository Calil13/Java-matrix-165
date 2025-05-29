package lessonMentor10$11.Task2;

import java.time.LocalDateTime;

public class TurnOffCommand implements Command {
    Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
        Logger.info(device, " turned off.");
    }
}