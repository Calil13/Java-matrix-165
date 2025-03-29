package lesson3;

import java.util.Scanner;

public class TernaryTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Big Number : " + (a > b ? a : b));

    }
}
