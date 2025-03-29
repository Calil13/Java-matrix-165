package lessonMentor2;

import java.util.Scanner;

public class TaskHome11 {
    public static void main(String[] args) {
        //Fibonacci sirasi:  0 1 1 2 3 5 8 13 21 34

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        int zero = 0,  one = 1;
        System.out.print("Fibonacci Series : " + zero + ", " + one);

        for (int i = 2; i < num; i++) {
            int next = zero + one;
            System.out.print(", " + next);
            zero = one;
            one = next;
        }
    }
}
