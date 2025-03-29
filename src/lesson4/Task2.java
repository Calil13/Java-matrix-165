package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : "); // 3 numbers
        int number = scanner.nextInt();

        while (number > 0){
            int result = number % 10;
            System.out.println(result);
            number /= 10;
        }
    }
}
