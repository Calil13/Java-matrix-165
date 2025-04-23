package lessonMentor5and6;

import java.util.Scanner;

public class Person {
    static Person[] persons = null;
    Scanner scanner = new Scanner(System.in);

    String name;
    String surname;
    int age;
    boolean gender;


    void printInfo() {
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Name : " + persons[i].name +
                    "\nSurname : " + persons[i].surname +
                    "\nAge  : " + persons[i].age +
                    "\nGender : " + (persons[i].gender ? "Male" : "Female"));
            System.out.println("--------------");
            System.out.println();
        }
    }

    Person fillAndGetPersons() {
        Person person = new Person();
        System.out.println("Enter Name : ");
        person.name = scanner.next();

        System.out.println("Enter Surname : ");
        person.surname = scanner.next();

        System.out.println("Enter age : ");
        person.age = scanner.nextInt();

        System.out.println("Enter gender : ");
        person.gender = scanner.nextBoolean();

        System.out.println("--------------");

        return person;
    }

    void choice() {
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - Register " +
                    "\n2 - Show all!" +
                    "\n3 - exit!"
            );

            System.out.println();

            System.out.print("Your choice - ");
            int check = scanner.nextInt();
            System.out.println();

            switch (check) {
                case 1:
                    register();
                    break;
                case 2:
                    printInfo();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Choose from 1 to 3.");
            }
        }
    }

    void register() {
        System.out.print("Enter number of person : ");
        int num = scanner.nextInt();
        persons = new Person[num];

        System.out.println();

        for (int i = 0; i < persons.length; i++) {
            System.out.println(i + 1 + "st registration!");
            persons[i] = fillAndGetPersons();
        }
    }
}

