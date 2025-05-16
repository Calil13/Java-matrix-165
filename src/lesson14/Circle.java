package lesson14;

public class Circle implements Figure{
    double pi = 3.14;
    double radius = 4;

    public double perimeter() {
        return 2 * pi * radius;
    }

    public double area() {
        return pi * (radius * radius);
    }
}
