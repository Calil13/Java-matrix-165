package lesson5;

import java.util.Arrays;

public class TaskHome1$ {
    public static void main(String[] args) {
        //min və max ədədi tap

        int[] numbers = {13, -4, 55, -1, 54, 3};

        Arrays.sort(numbers);
        System.out.println("Min : " + numbers[0]);
        System.out.println("Max : " + numbers[numbers.length - 1]);
    }
}
