package lessonMentor4;

import java.util.Calendar;
import java.util.Scanner;

public class TaskCall1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("1 - Addition " +
                "\n2 - Subtraction" +
                "\n3 - Multiplication " +
                "\n4 - Division " +
                "\n5 - Modulus");

        switch (num1) {

            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println(num1 % num2);
                break;
            default:
        }
    }
}
