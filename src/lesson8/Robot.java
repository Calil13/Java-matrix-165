package lesson8;

public class Robot {
    String mark;
    int power;
    int speed;

    //Constructor
    Robot(String mark,int power){
        this.mark = mark;
        this.power = power;
    }

    void FounSpeed() {

        if (mark == "İRobot" && power < 50) {
            speed = 60;
        } else if (mark == "Unitree" && power < 100 && power > 50) {
            speed = 80;
        }else {
            speed = 20;
        }
    }

    void InformationRobot(){
        System.out.println("Mark : " + mark +
                "\nPower : " + power +
                "\nSpeed : " + speed);
    }
}
