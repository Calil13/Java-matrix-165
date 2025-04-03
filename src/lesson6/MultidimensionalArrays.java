package lesson6;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};
        int[][] arrMultidimensiona1 = {arr1, arr2, arr3};
        int[][] arrMultidimensiona2 = {arr1, arr2, arr3};
        int[][][] arrMultidimensiona3 = {arrMultidimensiona1,arrMultidimensiona2};
    }
}
