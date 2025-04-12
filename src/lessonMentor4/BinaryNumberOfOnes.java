package lessonMentor4;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumberOfOnes {
    public static void main(String[] args) {
        //Ədədin ikilik say sistemindeki yazılışında birlərin sayını tapmaq.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scanner.nextInt();

        System.out.println();

        int temp = num;
        int index = 0;

        while (temp > 0){
            temp /= 2;
            index++;
        }

        int[] TempArray = new int[index];
        temp = num;
        for (int i = 0; i < index; i++) {
            TempArray[i] = temp % 2;
            temp /= 2;
        }

        int count = 0;
        for (int i = 0; i < index; i++) {
            if (TempArray[i] == 1){
                count++;
            }
        }

        int[] array = new int[TempArray.length];
        for (int i = 0; i < TempArray.length; i++) {
            array[i] = TempArray[TempArray.length - 1 - i];
        }
        System.out.println("Number is " + num);
        System.out.println("Decimal to binary : " + Arrays.toString(array));
        System.out.println("Number of ones : " + count);
    }
}
