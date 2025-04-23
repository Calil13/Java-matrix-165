package lesson12;

public class CircleCall {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        Circle.perimeterAndAreaCalc(5);
    }
}
