package lesson5;

public class TaskHome4 {
    public static void main(String[] args) {
        //arr-in içərsindəki bütün iki yaxın rəqəmləri cəmlə
        //və ən kiçik cəmi verən rəqəmləri yazdır.
        //(məs: {1,3,8,2} -> 1+3=4,3+8=11,8+2=10)
        //output : 1 and 3

        int[] arr = {8, 5, 1, 3, 5, 4};
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;
        int sum = 0;

        for (int i = 0; i < arr.length -1; i++) {
            sum = arr[i] + arr[i + 1];
            System.out.println(arr[i] + " + " + arr[i +1] + " = " + sum);

            if (sum < minSum){
                minSum = sum;
                num1 = arr[i];
                num2 = arr[i + 1];
            }
        }
        System.out.println("Numbers that give the smallest sum : " + num1 + " and " + num2);
    }
}
