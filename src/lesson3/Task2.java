package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num : ");
        int a = scanner.nextInt();

        switch (a) {

            default:
            case 1:
                System.out.println(a+=1);;
            case 2:
                System.out.println(a+=2);;
            case 3:
                System.out.println(a+=3);;
            case 4:
                System.out.println(a+=4);;
            case 5:
                System.out.println(a+=5);;
        }
    }
}
