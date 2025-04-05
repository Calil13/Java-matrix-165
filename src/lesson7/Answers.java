package lesson7;

public class Answers {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int result = myMath.min(4,5);
        System.out.println("Min : " + result);

        MyMath myMath1 = new MyMath();
        int result2 = myMath1.max(6,8);
        System.out.println("Max : " + result2);
    }
}
