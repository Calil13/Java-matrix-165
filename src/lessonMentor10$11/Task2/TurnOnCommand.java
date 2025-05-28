package lessonMentor10$11.Task2;

public class TurnOnCommand implements Command{
    Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
        Logger.info(device, " turned on.");
    }
}
