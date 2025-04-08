package lessonMentor3;

import java.util.Arrays;

public class TaskHome11 {
    //bubbleShort

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 9, 4, 1, 13};
        String  temp = Arrays.toString(array);

        bubbleShort(array);

        System.out.println("Old Array : " + temp);
        System.out.println("New Array : " + Arrays.toString(array));
    }


    public static void bubbleShort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
