package lessonMentor2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        // Factorial (5! -> 120) - while

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        int fac = 1;
        int i = 1;

        while (i <= num){

            fac *= i;
            i++;

        }
        System.out.println("Answer : " + fac);
    }
}
