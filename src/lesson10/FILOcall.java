package lesson10;

import java.util.Scanner;

public class FILOcall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FILO filo = new FILO();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter numbers : ");
            int num = scanner.nextInt();
            filo.set(num);
        }

        System.out.println("\nPopping all numbers : ");
        for (int i = 0; i < 10; i++){
            filo.get();
        }
    }
}
