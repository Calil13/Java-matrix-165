package lesson5;

public class TaskHome1 {
    public static void main(String[] args) {
        //min və max ədədi tap

        int[] numbers = {13, -4, 55, -1, 54, 3};
        int minNum = numbers[0];
        int maxNum = numbers[0];

        for (int num : numbers) {
            if (minNum > num) {
                minNum = num;
            }
            if (maxNum < num) {
                maxNum = num;
            }
        }
        System.out.println("Min : " + minNum);
        System.out.println("Max : " + maxNum);
    }
}
