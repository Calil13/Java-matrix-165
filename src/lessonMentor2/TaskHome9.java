package lessonMentor2;

import java.util.Scanner;

public class TaskHome9 {
    public static void main(String[] args) {
        //Ededin tersini yazmaq (1234 -> 4321)

        // TODO əvvələ və axıra 0 düşdükdə run da olar niə görünmür
        // məs: 01230 yazdıqda 321 yazır 03210 yox

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int temp = 0;
        int originalNum = num;

        while (originalNum > 0){

            int digit = originalNum % 10;
            temp = temp * 10 + digit;
            originalNum /= 10;

        }
        System.out.println("Answer : " + temp);
    }
}
