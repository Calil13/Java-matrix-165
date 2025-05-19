package Algorithm;

import java.util.Scanner;

public class Task2 {
    //input1 : word1 = "abc", word2 = "qms"
    //output : [a q b m c s]

    //input2 : word1 = "ab", word2 = "qmsz"
    //output : [a q b m s z]

    public static void main(String[] args) {
        char[] result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word 1 : ");
        String word1 = scanner.next();

        System.out.println("Enter word 2 : ");
        String word2 = scanner.next();

        int len1 = word1.length();
        int len2 = word2.length();
        int total = len1 + len2;

        char[] merged = new char[total];
        int index = 0;

        for (int i = 0; i < total; i++) {
            if (i < len1){
                merged[index++] = word1.charAt(i);
            }

            if (i < len2){
                merged[index++] = word2.charAt(i);
            }
        }

        for (char m : merged){
            System.out.print(m + " ");
        }
    }
}
