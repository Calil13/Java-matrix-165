package lesson7;

public class Answers {
    public static void main(String[] args) {
        //1-Min Number
        MyMath myMath = new MyMath();

        int result = myMath.min(4, 5);
        System.out.println("Min : " + result);

        //2-Max Number
        int result2 = myMath.max(6, 8);
        System.out.println("Max : " + result2);

        //3-Min Number in Array
        int[] array = {3, 1, 47, -8, 5};
        int arr = myMath.minArr(array);
        System.out.println("Minimum number in array : " + arr);

        //4-Factorial
        int fac = myMath.fac(6);
        System.out.println("Factorial : " + fac);
    }
}
