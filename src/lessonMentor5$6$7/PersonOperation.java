package lessonMentor5$6$7;

import java.util.Scanner;

public class PersonOperation {
    static Person[] persons = null;
    Scanner scanner = new Scanner(System.in);

    Person fillAndGetPersons() {
        Person person = new Person();
        System.out.println("Enter Name : ");
        person.name = scanner.next();

        System.out.println("Enter Surname : ");
        person.surname = scanner.next();

        System.out.println("Enter age : ");
        person.age = scanner.nextInt();

        System.out.println("Enter gender(True - Male, False - Female) : ");
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
                    "\n5 - Search Information!" +
                    "\n6 - Delete Registration!" +
                    "\n7 - Exit!"
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
                    showAll();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    changeInfo();
                    break;
                case 5:
                    searchInfo();
                    break;
                case 6:
                    delete();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Choose from 1 to 7.");
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

    void showAll() {
        int i = 1;
        for (Person j : persons) {
            j.printInfo(i++);
        }
    }

    void update() {
        System.out.println("Which registration do you want to change?");
        showAll();
        System.out.print("Answer : ");
        int index = scanner.nextInt();
        persons[--index] = fillAndGetPersons();
    }

    void changeInfo() {
        System.out.println("Which registration do you want to change?");
        showAll();

        System.out.print("Answer : ");
        int index = scanner.nextInt();

        System.out.println();

        System.out.println("Which information in this registry do you want to change?");
        System.out.print("1. Name" +
                "\n2. Surname" +
                "\n3. Age" +
                "\n4. Gender");
        System.out.println();
        System.out.print("\nAnswer : ");
        int info = scanner.nextInt();

        Person person = persons[--index];

        switch (info) {
            case 1:
                System.out.println("Enter Name : ");
                person.name = scanner.next();
                System.out.println("\n--------------");
                break;
            case 2:
                System.out.println("Enter Surname : ");
                person.surname = scanner.next();
                System.out.println("\n--------------");
                break;
            case 3:
                System.out.println("Enter age : ");
                person.age = scanner.nextInt();
                System.out.println("\n--------------");
                break;
            case 4:
                System.out.println("Enter gender(True - Male, False - Female) : ");
                person.gender = scanner.nextBoolean();
                System.out.println("\n--------------");
                break;
            default:
                System.out.println("Invalid choice! Choose from 1 to 4.");
        }
    }

    void searchInfo() {
        System.out.println("Which information do you want to search for?");
        System.out.print("1. Name" +
                "\n2. Surname" +
                "\n3. Age" +
                "\n4. Gender");
        System.out.println();
        System.out.print("\nAnswer : ");
        int info = scanner.nextInt();

        switch (info) {
            case 1:
                System.out.print("Enter Name : ");
                String name = scanner.next();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++){
                    if (persons[i].name.equals(name)){
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 2:
                System.out.print("Enter Surname : ");
                String surname = scanner.next();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++){
                    if (persons[i].surname.equals(surname)){
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 3:
                System.out.print("Enter age : ");
                int age = scanner.nextInt();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++){
                    if (persons[i].age == age){
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 4:
                System.out.print("Enter Gender : ");
                boolean gender = scanner.nextBoolean();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++){
                    if (persons[i].gender == gender){
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice! Choose from 1 to 4.");
        }
    }

    void delete() {
        System.out.println("Which registration do you want to delete?");
        showAll();
        System.out.print("Answer : ");
        int index = scanner.nextInt();
        persons[--index] = null;
    }
}
