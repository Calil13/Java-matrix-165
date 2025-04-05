package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        uzunluqu 10 olan array var scanner ilə 10 ədəd əlavə edirik bu arraya
        11 ci ədədi əlavə etdikdə yeni array yaradırıq və yeni arrayın ölçüsünü
        2 yə bölüb üzərinə əvvəlki arrayın uzunluqun gəlirik və yeni ədədi
        o array-ə əlavə edirik və isdədiyimiz zaman loop-u dayandırıb
        array-i ekrana yazdırırq
         */

        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;

        while (true){
            System.out.println("Enter the numbers! (Enter -1 to stop)");
            num = scanner.nextInt();

            String stop = scanner.nextLine();

            if (num == -1){
                break;
            } else if (count == arr.length) {
                int[] tempArr = new int[arr.length / 2 + 10];
                for (int i = 0; i < arr.length; i++) {
                    tempArr[i] = arr[i];
                }
                arr = tempArr;
            }
            arr[count++] = num;
        }
        System.out.println("The last value of the array : " + Arrays.toString(arr));

    }
}
