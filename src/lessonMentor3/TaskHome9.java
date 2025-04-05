package lessonMentor3;

import java.util.Arrays;

public class TaskHome9 {
    public static void main(String[] args) {
        /*
        Arrayin elementlerinden basqa digerleri ile
        hasilini yeni arrayde yazmaq.(1 2 3 4  ->  24 12 8 6)
        (meselen 2-nin yerine ozunden basqa diger 3 elementi bir birine vurub yaziriq)
         */

        int[] array = {1, 2, 3, 4};
        int[] arrayNew = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int temp = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j){
                    temp *= array[j];
                }
            }
            arrayNew[i] = temp;
        }
        System.out.println("Result : " + Arrays.toString(arrayNew));
    }
}
