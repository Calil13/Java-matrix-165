package lesson4;

import java.util.Scanner;

public class TaskHome1 {
    public static void main(String[] args) {

        // 2 yə bölünən ədədlərin factorialını tap

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = scanner.nextInt();

        for (int i = 2; i <= num; i += 2) {
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "! : " + factorial);
        }
    }
}
