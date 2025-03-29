package lessonMentor2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Natural ədədin rəqəmlərinin hasilinin
        // onun rəqəmləri cəminə nisbətini hesablayın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        int sum = 0;
        int multiplication = 1;

        while (num > 0) {

            int temp = num % 10;
            sum += temp;
            multiplication *= temp;
            num /= 10;

        }
        double answer = (double) multiplication / sum;
        System.out.printf("Answer : " + "%.2f",answer);
    }
}
