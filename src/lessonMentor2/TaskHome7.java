package lessonMentor2;

import java.util.Scanner;

public class TaskHome7 {
    public static void main(String[] args) {
        // Mukemmel ededleri cixaran kod
        // (ozunden basqa bolenlerinin cemi ozunu veren eded -> 6)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        int total = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                total += i;
            }
        }
        if (total == num) {
            System.out.println(num + " - is Perfect Number!");
        }else {
            System.out.println(num + "- is't Perfect Number!");
        }
    }
}
