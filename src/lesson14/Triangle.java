package lesson14;

public class Triangle extends Figure{
    double heigh = 8;
    double a = 5, b = 6, c = 7;

    double perimeter() {
        return a + b + c;
    }

    double area() {
        return (a * heigh) / 2;
    }
}
