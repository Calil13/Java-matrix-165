package lesson7;

import java.util.Scanner;

public class MyMathAnswers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMath myMath = new MyMath();

        //1-Min Number
        int result = myMath.min(4, 5);
        System.out.println("1 - Min : " + result);

        //2-Max Number
        int result2 = myMath.max(6, 8);
        System.out.println("2 - Max : " + result2);

        //3-Min Number in Array
        int[] array = {3, 1, 47, -8, 5};
        int arr = myMath.minArr(array);
        System.out.println("3 - Minimum number in array : " + arr);

        //4-Factorial
        int fac = myMath.fac(6);
        System.out.println("4 - Factorial : " + fac);

        //5-Power
        int power = myMath.pow(12,2);
        System.out.println("5 - Power : " + power);

        System.out.println("");

        //6-Prime
        System.out.println("6 - isPrime : ");
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();

        if (myMath.prime(number)){
            System.out.println(number + " Number is Prime!");
        }else {
            System.out.println(number + " Number is Complex!");
        }

        System.out.println("");

        //7-Palindrome
        System.out.println("7 - Palindrome : ");
        System.out.print("Enter the Number : ");
        int number1 = scanner.nextInt();

        if (myMath.palindrome(number1)){
            System.out.println(number1 + " Number is Palindrome!");
        }else {
            System.out.println(number1 + " Number isn't Palindrome!");
        }

        System.out.println("");

        //8 - Even Odd
        System.out.println("8 - Even and Odd : ");
        System.out.print("Enter the Number : ");
        int number2 = scanner.nextInt();

        if (myMath.even(number2)){
            System.out.println(number2 + " Number is Even!");
        }else {
            System.out.println(number2 + " Number is Odd!");
        }
    }
}
