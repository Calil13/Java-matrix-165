package lesson14;

public class Circle extends Figure{
    double pi = 3.14;
    double radius = 4;

    double perimeter() {
        return 2 * pi * radius;
    }

    double area() {
        return pi * (radius * radius);
    }
}
