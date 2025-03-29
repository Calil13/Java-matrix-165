package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = scanner.nextInt();

        if (a > 0){
            System.out.println("Pozitive");
        }
        if (a < 0){
            System.out.println("Negative");
        }
        if (a % 2 == 0 && a != 0){
            System.out.println("Even");
        }
        if (a % 2 != 0){
            System.out.println("Odd");
        }
        if (a == 0){
            System.out.println("Answer : 0");
        }
    }
}
