package Algorithm;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Task3 {
    //perfect number

    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                total += i;
            }
        }
        if (total == num){
            System.out.println("Perfect number!");
        }else {
            System.out.println("Error!");
        }
    }
}
