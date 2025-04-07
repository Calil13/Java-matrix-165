package lesson7;

public class MyMath {
    //Min Number
    int min(int num1, int num2) {
        return Math.min(num1, num2);
    }

    //Max Number
    int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    //Min Number in Array
    int minArr(int[] arr) {

        int minNum = arr[0];

        for (int num : arr) {
            if (minNum > num) {
                minNum = num;
            }
        }
        return minNum;
    }

    //Factorial
    int fac(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    //Power
    int pow(int num, int powNum) {
        int power = 1;

        for (int i = 0; i < powNum; i++) {
            power *= num;
        }
        return power;
    }

    //Prime
    boolean prime(int num) {
        if (num <= 1) {
            return false; // 1 və mənfi ədədlər sadə deyil
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Palindrome
    boolean palindrome(int num) {
        int temp = num;
        int reversedNum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversedNum =reversedNum * 10 + digit;
            temp /= 10;
        }

        if (num == reversedNum){
            return true;
        }

        return false;
    }

    //Even Odd
    boolean Even(int num){
        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

