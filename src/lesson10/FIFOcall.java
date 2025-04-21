package lesson10;

import java.util.Scanner;

public class FIFOcall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FIFO fifo = new FIFO();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter numbers : ");
            int num = scanner.nextInt();
            fifo.set(num);
        }

        System.out.println("\nPopping all numbers : ");
        for (int i = 0; i < 10; i++) {
            fifo.get();
        }
    }
}
