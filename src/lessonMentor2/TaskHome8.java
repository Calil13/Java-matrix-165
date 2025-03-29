package lessonMentor2;

import java.util.Scanner;

public class TaskHome8 {
    public static void main(String[] args) {
        /*Hər hansı bir natural n ədədini götürək.
        Əgər ədəd cütdürsə, onda onu 2-ə bölək,
        əgər təkdirsə ona 1 əlavə edək.
        Bir neçə belə dəyişmədən sonra həmişə 1 alacağıq.
        Məsələn, 11 ədədindən 12 ədədi alınır, sonra 6, 3, 4, 2 və sonda 1.
        Beləliklə, 11-dən 1 almaq üçün 6 dəyişiklik etmək lazımdır.
        Verilmiş natural ədədə görə 1 alınana qədər onun dəyişmələrinin sayını tapın.
        (input: 11 ; output: 6)*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int a = 0, b = 0;

        while (num > 0) {
            if (num % 2 != 0) {
                num += 1;
                a++;
            }
            num /= 2;
            b++;
            if (num == 1) {
                System.out.println("Answer : " + num);
                break;
            }
        }
        System.out.println((a + b) + " Changes!");
    }
}