package lessonMentor2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //a, b, c tam ədədləri verilir. onların arasından
        //heç olmasa bir cüt və bir tək ədəd olub olmadığını təyin edin
        //YES və  ya NO çap etməli. Hamısı cüt və  ya tək olarsa NO yazdırsın
        // biri tək və ya cüt olarsa YES yazdır

        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number! ");

        System.out.println("Number 1 : ");
        num1 = scanner.nextInt();

        System.out.println("Number 2 : ");
        num2 = scanner.nextInt();

        System.out.println("Number 3 : ");
        int num3 = scanner.nextInt();


        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0){
            System.out.println("NO");
        } else if (num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 != 0) {
            System.out.println("Answer is NO!");
        }else {
            System.out.println("Answer is Yes");
        }
    }
}
