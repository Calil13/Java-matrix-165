package lesson5;

import java.util.Arrays;

public class TaskHome3 {
    public static void main(String[] args) {
        //array-in içindəki ilk 2 min rəqəmi yazdır

        int[] arr = {8,5,1,33,52,4};

        Arrays.sort(arr);
        System.out.println(arr[0] + " and " + arr[1]);
    }
}
