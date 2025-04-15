package lessonMentor5;

import java.util.Scanner;

public class Person {
    String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        return scanner.nextLine();
    }

    String getSurname(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your surname : ");
        return scanner.nextLine();
    }

    int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        return scanner.nextInt();
    }

    String getDateOfBirth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth : ");
        return scanner.nextLine();
    }

}
