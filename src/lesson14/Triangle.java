package lesson14;

public class Triangle implements Figure{
    double heigh = 8;
    double a = 5, b = 6, c = 7;

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        return (a * heigh) / 2;
    }
}
