package lesson8;

public class FigureCall {
    public static void main(String[] args) {
        Circle circle = new Circle();
        int radius = 4;
        double perimeterC = circle.perimete(radius);
        double areaC = circle.area(radius);
        System.out.println("1 - Circle\n" + "Perimeter : " + perimeterC +
                "\nArea : " + areaC);

        System.out.println();

        Triangle triangle = new Triangle();
        double perimeterT = triangle.perimeter(12,8,5);
        double areaT = triangle.area(10,2);
        System.out.println("2 - Triangle\n" + "Perimeter : " + perimeterT +
                "\nArea : " + areaT);

        System.out.println();

        Square square = new Square();
        double side = 10;
        double perimeterS = square.perimete(side);
        double areaS = square.area(side);
        System.out.println("3 - Square\n" + "Perimeter : " + perimeterS +
                "\nArea : " + areaS);
    }
}
