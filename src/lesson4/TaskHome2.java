package lesson4;

import java.util.Scanner;

public class TaskHome2 {
    public static void main(String[] args) {

        //Palindrom ədədlər

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int temp = num;
        int reversedNum = 0;

        while (temp > 0){

            int digit = temp % 10;
            reversedNum =reversedNum * 10 + digit;
            temp /=10;

        }
        System.out.println("Reversed Num : " + reversedNum);

        if (num == reversedNum){
            System.out.println("Number is Polindrom!");
        }else {
            System.out.println("Number isn't Polindrom!");
        }
    }
}
