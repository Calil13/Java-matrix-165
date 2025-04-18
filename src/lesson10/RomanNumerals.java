package lesson10;

public class RomanNumerals {
    int getValue(char ch) {
        int value = switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
        return value;
    }

    int romToInt(String s) {
        int total = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = getValue(ch);

            if (value < previousValue) {
                total -= value;
            } else {
                total += value;
            }
            previousValue = value;
        }
        return total;
    }
}
