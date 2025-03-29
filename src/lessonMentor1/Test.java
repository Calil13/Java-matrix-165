package lessonMentor1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : "); // 3 numbers
        int number = scanner.nextInt();

        int result = number % 10;
        System.out.println(result);

        number = number /10;
        System.out.println(number % 10);

        System.out.println(number / 10);

    }
}
