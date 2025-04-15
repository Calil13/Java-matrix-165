package lesson9;

import java.util.Scanner;

public class XandOGame {
    char add(char[][] xo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Game!");

        int count = 0;

        while (true) {
            System.out.println();
            System.out.println("Player 1 coordinates!(X)");
            System.out.print("Enter your Line coordinate(0-2) : ");
            int line1 = scanner.nextInt();

            System.out.print("Enter your Column coordinate(0-2) : ");
            int column = scanner.nextInt();

            if (xo[line1][column] == ' ') {
                xo[line1][column] = 'X';
                count++;
            } else {
                System.out.println("This coordinate is already taken!");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(xo[i][j] + " ");
                }
                System.out.println();
            }
            if (check(xo) == 'X'){
                System.out.println("Player 1 (X) wins!");
                break;
            }
            if (count == 9){
                System.out.println("Game over!");
                break;
            }

            System.out.println();

            System.out.println("Player 2 coordinates!(O)");
            System.out.print("Enter your Line coordinate(0-2) : ");
            int line2 = scanner.nextInt();

            System.out.print("Enter your Column coordinate(0-2) : ");
            int column2 = scanner.nextInt();

            if (xo[line2][column2] == ' ') {
                xo[line2][column2] = 'O';
                count++;
            } else {
                System.out.println("This coordinate is already taken!");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(xo[i][j] + " ");
                }
                System.out.println();
            }
            if (check(xo) == 'O'){
                System.out.println("Player 2 (O) wins!" );
                break;
            }
            if (count == 9){
                System.out.println("Game over!");
                break;
            }
        }
        return ' ';
    }

    char check(char[][] xo) {
        // Sətirləri yoxla
        for (int i = 0; i < 3; i++) {
            if (xo[i][0] != ' ' && xo[i][0] == xo[i][1] && xo[i][1] == xo[i][2]) {
                return xo[i][0];
            }
        }

        // Sütunları yoxla
        for (int i = 0; i < 3; i++) {
            if (xo[0][i] != ' ' && xo[0][i] == xo[1][i] && xo[1][i] == xo[2][i]) {
                return xo[0][i];
            }
        }

        // Əsas diaqonal
        if (xo[0][0] != ' ' && xo[0][0] == xo[1][1] && xo[1][1] == xo[2][2]) {
            return xo[0][0];
        }

        // Əks diaqonal
        if (xo[0][2] != ' ' && xo[0][2] == xo[1][1] && xo[1][1] == xo[2][0]) {
            return xo[0][2];
        }

        return ' ';
    }
}
