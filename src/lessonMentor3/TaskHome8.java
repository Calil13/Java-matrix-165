package lessonMentor3;

import java.util.Arrays;

public class TaskHome8 {
    public static void main(String[] args) {
        /*
        Massivin elementlərini 1 addım
        dövrü olaraq sağa sürüşdürün
        (numune olaraq input: 1 2 3 4 -> output: 4 1 2 3)
         */

        int[] array = {2, 5, 8, 9, 13};
        int temp = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }
}
