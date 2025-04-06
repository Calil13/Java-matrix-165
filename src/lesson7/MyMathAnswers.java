package lesson7;

import java.util.Scanner;

public class MyMathAnswers {
    public static void main(String[] args) {
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

        //6-Prime
        Scanner scanner = new Scanner(System.in);
        System.out.print("6 - Enter the Number : ");
        int number = scanner.nextInt();

        if (myMath.prime(number)){
            System.out.println(number + " Number is Prime!");
        }else {
            System.out.println(number + " Number is Complex!");
        }
    }
}
