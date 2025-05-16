package lesson14;

public class Rectangle implements Figure {
    double a = 3, b = 4;

    public double perimeter() {
        return 2 * (a + b);
    }

    public double area() {
        return a * b;
    }
}
