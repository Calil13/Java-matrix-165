package lessonMentor4;

import java.util.Scanner;

public class Task1 {

    void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = scanner.nextInt();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextInt();

        System.out.println();

        System.out.println("Choose Operation!");
        System.out.println("1 - Addition " +
                "\n2 - Subtraction" +
                "\n3 - Multiplication " +
                "\n4 - Division " +
                "\n5 - Modulus" +
                "\n6 - Exit!");

        System.out.println();

        System.out.println("Your choice : ");
        int check = scanner.nextInt();

        switch (check) {
            case 1:
                System.out.println("AdditionAddition : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division : " + (num1 / num2));
                break;
            case 5:
                System.out.println("Modulus : " + (num1 % num2));
                break;
            case 6:
                System.out.println("Exited!");
            default:
                System.out.println("Invalid choice! Choose from 1 to 6.");
        }
    }
}
