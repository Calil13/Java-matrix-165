package lessonMentor5and6;

import java.util.Scanner;

public class PersonOperation {
    static Person[] persons = null;
    Scanner scanner = new Scanner(System.in);

    void printInfo() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                System.out.println((i + 1) + "." +
                        "\nName : " + persons[i].name +
                        "\nSurname : " + persons[i].surname +
                        "\nAge  : " + persons[i].age +
                        "\nGender : " + (persons[i].gender ? "Male" : "Female"));
                System.out.println("--------------");
                System.out.println();
            }
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
                    "\n3 - Update Informations!" +
                    "\n4 - Change Information!" +
                    "\n5 - Delete Registration!" +
                    "\n6 - Exit!"
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
                    update();
                    break;
                case 4:
                    changeInfo();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
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

    void update() {
        System.out.println("Which registration do you want to change?");
        printInfo();
        System.out.print("Answer : ");
        int index = scanner.nextInt();
        persons[--index] = fillAndGetPersons();
    }

    void delete() {
        System.out.println("Which registration do you want to delete?");
        printInfo();
        System.out.print("Answer : ");
        int index = scanner.nextInt();
        persons[--index] = null;
    }
    void changeInfo(){

    }
}
