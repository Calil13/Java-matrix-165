package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = scanner.nextInt();

        int temp = 1;

        for (int i = 1; i <= num; i++){
            temp *=i;
        }
        System.out.println("Factorial : " + temp);
    }
}
