package lessonMentor2;

import java.util.Scanner;

public class TaskHome10 {
    public static void main(String[] args) {
        /*
        Tam ədədin(menfi eded de verile biler) ikinci rəqəmini tapmalı.
        Sayma yüksək mərtəbədən başlayır.(input 43694 -> output 3)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        num = Math.abs(num);
        String numStr = Integer.toString(num);

        if (numStr.length() < 2){
            System.out.println("Number has less than two digits.");
        }else {
            System.out.println("Second digit - " + numStr.charAt(1));
        }
    }
}
