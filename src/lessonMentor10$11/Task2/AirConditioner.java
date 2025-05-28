package lessonMentor10$11.Task2;

public class AirConditioner implements Device{
    boolean isOn;
    private double temperature;
    private String acName;

    @Override
    public String toString() {
        return acName;
    }

    public AirConditioner(String acName) {
        this.acName = acName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }
}
