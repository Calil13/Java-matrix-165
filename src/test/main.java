package test;

public class main {
    public static void main(String[] args) {

        int num = 1234;

        while (num >= 100){
            num /= 10;
        }
        System.out.println(num % 10);
    }
}
