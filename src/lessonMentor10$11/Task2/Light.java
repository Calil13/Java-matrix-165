package lessonMentor10$11.Task2;

public class Light implements Device{
    private boolean isOn;
    private String lightName;

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return lightName;
    }

    public Light(String lightName) {
        this.lightName = lightName;
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
