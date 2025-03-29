package lesson3;

import java.util.Scanner;

public class TaskHome1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month = scanner.nextInt();

        switch (month) {
            case 12, 1, 2:
                System.out.println("Qış");
                break;
            case 3, 4, 5:
                System.out.println("Yaz");
                break;
            case 6, 7, 8:
                System.out.println("Yay");
                break;
            case 9, 10, 11:
                System.out.println("Payız");
                break;
            default:
                System.out.println("Belə bir ay yoxdur!");
        }
    }
}
