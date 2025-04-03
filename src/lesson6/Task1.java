package lesson6;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        uzunluqu 10 olan array var scanner ilə 10 ədəd əlavə edirik bu arraya
        11 ci ədədi əlavə etdikdə yeni array yaradırıq
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
            if (array1[i] == 11){
                for (int j = i; j < array1.length * 1.5; j++) {
                    int array2 = scanner.nextInt();
                }
            }
        }
    }
}
