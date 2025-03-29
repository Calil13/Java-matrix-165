package lesson3;

import java.util.Scanner;

public class TaskHome3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number : ");
        double b = scanner.nextDouble();
        double c;

        System.out.println("Old a : " + a);
        System.out.println("Old b : " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("New a : " + a);
        System.out.println("New b : " + b);
    }
}
