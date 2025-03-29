package lesson3;

import java.util.Scanner;

public class TaskHome2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1 : ");
        double num1 = scanner.nextDouble();

        System.out.println("Number 2 :");
        double num2 = scanner.nextDouble();

        String operator = scanner.next();

        switch (operator) {

            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 * num2);
                break;
            case "%":
                System.out.println(num1 * num2);
                break;
        }
    }
}
