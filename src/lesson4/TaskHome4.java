package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TaskHome4 {
    public static void main(String[] args) {
        // Zər oyunu
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int x = 1, y = 6; // zər 1-dən 6-ya qədər
        int totalP1 = 0;
        int totalP2 = 0;

        System.out.println("START THE GAME!");
        System.out.println("Goal: Reach exactly 30 points!");
        System.out.println();

        while (true) {
            System.out.println("Player 1's turn. Press Enter to roll the dice...");
            scanner.nextLine();
            int diceP1 = x + random.nextInt(y - x + 1);
            System.out.println("Player 1 rolled: " + diceP1);
            if (totalP1 + diceP1 <= 30) {
                totalP1 += diceP1;
            }
            System.out.println("Player 1 Total: " + totalP1);
            if (totalP1 == 30) {
                System.out.println("Player 1 is the winner!");
                break;
            }

            System.out.println();

            System.out.println("Player 2's turn. Press Enter to roll the dice...");
            scanner.nextLine();
            int diceP2 = x + random.nextInt(y - x + 1);
            System.out.println("Player 2 rolled: " + diceP2);
            if (totalP2 + diceP2 <= 30) {
                totalP2 += diceP2;
            }
            System.out.println("Player 2 Total: " + totalP2);
            if (totalP2 == 30) {
                System.out.println("Player 2 is the winner!");
                break;
            }

            System.out.println("\n----------------------------\n");
        }
    }
}