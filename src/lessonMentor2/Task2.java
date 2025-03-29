package lessonMentor2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //a dan b yə qədər intervalda tək ədədlərin cəmini tap

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1 :");
        int num1 = scanner.nextInt();

        System.out.println("Number 2 : ");
        int num2 = scanner.nextInt();

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0 ) {
                sum += i;
            };
        }
        System.out.println("Answer : " + sum);
    }
}
