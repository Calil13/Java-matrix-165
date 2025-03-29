package lesson5;

public class TaskHome5 {
    public static void main(String[] args) {
        //arr-in içərsindəki bütün rəqəmləri cəmlə
        //və ən kiçik cəmi verən rəqəmləri yazdır
        //(məs: {1,3,8,2} -> 1+3=4, 1+8=9, 1+2=3, 3+8=11, 3+2=5, 8+2=10)
        //output : 1 and 2

        int[] arr = {12, 3, -2, 5, 4,};
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (i == j) {
                    continue;
                }
                System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                if (sum < minSum) {
                    minSum = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("Numbers that give the smallest sum : " + num1 + " and " + num2);
    }
}
