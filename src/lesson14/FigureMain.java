package lesson14;

public class FigureMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println("Circle Perimeter : " + circle.perimeter());
        System.out.println("Circle Area : " + circle.area());

        System.out.println("\nRastangle Perimeter : " + rectangle.perimeter());
        System.out.println("Rectangle Area : " + rectangle.area());

        System.out.println("\nTriangle Perimeter : " + triangle.perimeter());
        System.out.println("Triangle Area : " + triangle.area());
    }
}
