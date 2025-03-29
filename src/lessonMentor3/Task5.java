package lessonMentor3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        //Tam ədədlər ardıcıllığı verilir(array ile).
        //Ardıcıllığın hər bir müsbət elementini
        //2 vahid artırmalı(arrayde qalacaq).

        int[] arr1 = {1, 4, 3, 5, 7};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] + 2;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
