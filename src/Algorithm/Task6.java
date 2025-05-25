package Algorithm;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 3};

        int max = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > max2){
                max2 = arr[i];
            }
        }

        System.out.println(max + "," + max2);
    }
}
