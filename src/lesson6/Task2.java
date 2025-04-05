package lesson6;

public class Task2 {
    public static void main(String[] args) {
        //TODO For Loop
        //İki ölçülü array-in elementlərin konsula çıxart

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};
        int[][] array = {arr1, arr2, arr3};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
