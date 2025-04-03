package lesson6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //iki ölçülü arrayin içərisindəki
        //ilk 2 min dəyəri yazdır

        int[] arr1 = {-12, -23, 3};
        int[] arr2 = {4, 5, -1};
        int[] arr3 = {7, 0, 9};
        int[][] array = {arr1, arr2, arr3};
        int min1 = array[0][0];
        int min2 = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min1){
                    min2 = min1;
                    min1 = array[i][j];
                } else if (array[i][j] < min2) {
                    min2 = array[i][j];
                }
            }
        }
        System.out.println("Min1 : " + min1);
        System.out.println("Min2 : " + min2);
    }
}
