package lessonMentor3;

import java.util.Scanner;

public class TaskHome7 {
    public static void main(String[] args) {
        /*
        n sayda tam ədədlər üçün 6-ya tam (qalıqsız) bölünən
        müsbət ədədlərin cəmini və sayını tapın.
        (n - arrayin ölçüsüdü Scanner ile daxil edin)
         */

        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " numbers!");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Input arrays : ");
        for (int num1 : array) {
            System.out.print(num1 + ", ");
        }
        System.out.println();
        for (int num2 : array) {
            if (num2 % 6 == 0) {
                sum += num2;
                count++;
            }
        }
        System.out.println("Sum is " + sum + ", and their number is " + count);
    }
}
