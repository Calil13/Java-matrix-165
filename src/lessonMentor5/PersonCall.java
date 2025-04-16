package lessonMentor5;

import java.util.Scanner;

public class PersonCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        Person[] people = new Person[100];

        while (true) {
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();

            System.out.print("Enter Surname : ");
            String surname = scanner.nextLine();

            System.out.print("Enter age : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            people[size] = new Person(name,surname,age);
            size++;

            System.out.print("Do you want to continue? (yes/no): ");
            System.out.print("\nAnswer : ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("\n--- All People ---");
        for (int i = 0; i < size; i++) {
            people[i].printInfo();
        }
    }
}
