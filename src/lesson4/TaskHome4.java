package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TaskHome4 {
    public static void main(String[] args) {

        // Zər oyunu


        Random random = new Random();

        int x = 1, y = 6;
        int totalP1 = 0;
        int totalP2 = 0;

        System.out.println("START THE GAME!");

        System.out.println("Player 1 : ");

        while (true) {
            int dice1P1 = x + random.nextInt(y - x + 1);
            System.out.println("1st Dice Score : " + dice1P1);
            int dice2P1 = x + random.nextInt(y - x + 1);
            System.out.println("2st Dice Score : " + dice2P1);
            totalP1 += dice1P1 + dice2P1;
            if (totalP1 == 30) {
                System.out.println("The first player is the winne!");
                return;
            } else if (totalP1 > 30) {
                totalP1 -= dice1P1 + dice2P1;
                break;
            }
        }
        System.out.println("The first player's total points - " + totalP1);

        System.out.println(" " +
                "");

        System.out.println("Player 2 : ");

        while (true) {
            int dice1P2 = x + random.nextInt(y - x + 1);
            System.out.println("1st Dice Score : " + dice1P2);
            int dice2P2 = x + random.nextInt(y - x + 1);
            System.out.println("2st Dice Score : " + dice2P2);
            totalP2 += dice1P2 + dice2P2;
            if (totalP2 == 30) {
                System.out.println("The second player is the winner!");
                return;
            } else if (totalP2 > 30) {
                totalP2 -= dice1P2 + dice2P2;
                break;
            }
        }
        System.out.println("The second player's total points - " + totalP2);
    }
}
