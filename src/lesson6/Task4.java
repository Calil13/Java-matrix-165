package lesson6;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //TODO boolean ilə həll et, vido dərsdə var
        /*
        bir ölçülü array-in içərisindən ən kiçik ədədi
        tapırıq və bütün ədədlərdən o ədədi çıxırıq və
        array-in içərisindəki ədədlər hamıs 0 və ya mənfi
        olana kimi bu davam etdir, arrayda mənfi ədəd varsa
        o ədədə dəymirik olduğu kimi qalır.
         */

        int[] array = {1, 5, 2, 7, -3, 8};
        boolean check = true;

        while (check) {
            int minNum = Integer.MAX_VALUE;

            for (int arr : array) {
                if (arr > 0 && arr < minNum) {
                    minNum = arr;
                }
            }
            check = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0){
                    array[i] -= minNum;
                    check = true;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}