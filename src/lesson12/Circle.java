package lesson12;

public class Circle {
//    circke sinif yaransin icerisinde perimetr ve area hesablansin
//    hemin sinfin icerisinde static pi deyeri olacaq ve static metod olacaq
//    static metod adi calculator forp erimeter area
//    radiusa gore

    static double PI = 3.14;
    double r;

    Circle(int r) {
        this.r = r;
    }

    double perimeter() {
        return 2 * PI * r;
    }

    double area() {
        return PI * (r * r);
    }

    static void perimeterAndAreaCalc(double r) {
        System.out.println("Perimeter : " + 2 * PI * r);
        System.out.println("Area : " + PI * (r * r));
    }
}
