package lessonMentor2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // Factorial (5! -> 120) - for


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int fac = 1;

        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        System.out.println("Answer : " + fac);
    }
}
