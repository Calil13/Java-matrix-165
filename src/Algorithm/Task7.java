package Algorithm;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 0, 8};
        int sum = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }

        System.out.println(sum);
    }
}
