package Algorithm;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,5,6,7};

        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}
