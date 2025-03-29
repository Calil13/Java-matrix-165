package lessonMentor3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //ilk elementle son elementin yerlerini deyismek

        int[] arr1 = {1, 4, 3, 5, 7};
        int temp = arr1[0];
        arr1[0] = arr1[arr1.length - 1];
        arr1[arr1.length - 1] = temp;
        System.out.println(Arrays.toString(arr1));
    }
}
