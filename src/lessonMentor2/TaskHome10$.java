package lessonMentor2;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TaskHome10$ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        if (num < 10) {
            System.out.println("This number has no second digit!");
        } else {
            while (num >= 100) {
                num /= 10;
            }
        }
        System.out.println("Second digit is " + num % 10 + "!");
    }
}
