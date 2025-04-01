package lesson5;

public class TaskHome3$ {
    public static void main(String[] args) {
        //array-in içindəki ilk 2 min rəqəmi yazdır

        int[] arr = {8, 5, 1, 33, 52, 4};
        int minNum1 = Integer.MAX_VALUE;
        int minNum2 = Integer.MAX_VALUE;

        for (int num1 : arr) {
            if (minNum1 > num1) {
                minNum1 = num1;
            }
        }
        for (int num : arr) {
            if (num > minNum1 && num < minNum2) {
                minNum2 = num;
            }
        }
        System.out.println("First Min : " + minNum1);
        System.out.println("Second Min : " + minNum2);
    }
}
