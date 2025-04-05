package lesson6;

import java.util.Arrays;

public class Task2$ {
    public static void main(String[] args) {
        //TODO For-Each Loop
        //İki ölçülü array-in elementlərin konsula çıxart

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        int[][] array = {array1, array2, array3};

        for (int[] arr1 : array){
            for (int arr2 : arr1){
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
    }
}
