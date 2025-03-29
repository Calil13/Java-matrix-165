package lessonMentor2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //ededin reqemleri cemini tap
        // məs: 123 -> 1+2+3=6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        int sum = 0;

        while (num > 0) {

            int temp = num % 10;
            sum += temp;
            num /= 10;

        }
        System.out.println("Answer : " +  sum);
    }
}
