package lesson14;

public class Rectangle extends Figure {
    double a = 3, b = 4;

    double perimeter() {
        return 2 * (a + b);
    }

    double area() {
        return a * b;
    }
}
