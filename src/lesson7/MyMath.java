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
}

