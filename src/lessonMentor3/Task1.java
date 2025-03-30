package lessonMentor3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Fibonacci. (input Fibonacci in uzunlugu olacaq)

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextByte();
        int[] fioboArray = new int[n];
        fioboArray[0] = 0;
        fioboArray[1] = 1;

        for (int i = 2; i < fioboArray.length; i++) {
            fioboArray[i] = fioboArray[i -1] + fioboArray[i -2];
        }
        System.out.println(Arrays.toString(fioboArray));
    }
}
