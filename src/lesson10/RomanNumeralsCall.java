package lesson10;

import java.util.Scanner;

public class RomanNumeralsCall {
    public static void main(String[] args) {
        RomanNumerals romanNumerals = new RomanNumerals();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roman Numeral : ");
        String s = scanner.nextLine().toUpperCase();

        int result = romanNumerals.romToInt(s);
        System.out.println("Integer value : " + result);
    }
}
