package lesson8;

public class Circle {
    double pi = 3.14;

    double perimete(double radius){
        return 2 * pi *radius;
    }

    double area(double radius){
        return pi * (radius * radius);
    }
}
