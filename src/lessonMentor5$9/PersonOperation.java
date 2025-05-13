package lessonMentor5$9;

import java.util.Scanner;

public class PersonOperation {
    static Person[] persons = null;
    Scanner scanner = new Scanner(System.in);

    Person fillAndGetPersons() {
        Person person = new Person();
        System.out.println("Enter Name : ");
        Person.name = scanner.next();

        System.out.println("Enter Surname : ");
        Person.surname = scanner.next();

        System.out.println("Enter age : ");
        Person.age = scanner.nextInt();

        System.out.println("Enter gender(True - Male, False - Female) : ");
        Person.gender = scanner.nextBoolean();

        System.out.println("--------------");

        return person;
    }

    void choice() {
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - Register " +
                    "\n2 - Show all!" +
                    "\n3 - Update Information!" +
                    "\n4 - Update Information2!" +
                    "\n5 - Change Information!" +
                    "\n6 - Search Information!" +
                    "\n7 - Search By Start Words!" +
                    "\n8 - Delete Registration!" +
                    "\n9 - Exit!"
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
                    update2();
                    break;
                case 5:
                    changeInfo();
                    break;
                case 6:
                    searchInfo();
                    break;
                case 7:
                    searchByStartWords();
                    break;
                case 8:
                    delete();
                    break;
                case 9:
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
            if (j != null) {
                j.printInfo(i++);
            }
        }
    }

    void update() {
        System.out.println("Which registration do you want to change?");
        showAll();
        System.out.print("Answer : ");
        int index = scanner.nextInt();
        persons[--index] = fillAndGetPersons();
    }

    void update2(){
        System.out.println("Which registration do you want to change?");
        showAll();
        System.out.print("Answer : ");
        int index = scanner.nextInt();

        System.out.println();

        System.out.println("Which information in this registry do you want to change? " +
                "(name, surname, age, gender)");

        String changeInfo = scanner.next();
        String[] array = changeInfo.split(",");

        while (true) {
            for (String s : array) {
                if (s.equals("name")) {
                    System.out.println("Enter Name : ");
                    Person.name = scanner.next();
                }
                if (s.equals("surname")) {
                    System.out.println("Enter Surname : ");
                    Person.surname = scanner.next();
                }
                if (s.equals("age")) {
                    System.out.println("Enter Age : ");
                    Person.age = scanner.nextInt();
                }
                if (s.equals("gender")) {
                    System.out.println("Enter gender(True - Male, False - Female) : ");
                    Person.gender = scanner.nextBoolean();
                }
            }
        }
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
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].name.equals(name)) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 2:
                System.out.print("Enter Surname : ");
                String surname = scanner.next();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].surname.equals(surname)) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 3:
                System.out.print("Enter age : ");
                int age = scanner.nextInt();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].age == age) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 4:
                System.out.print("Enter Gender : ");
                boolean gender = scanner.nextBoolean();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].gender == gender) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice! Choose from 1 to 4.");
        }
    }

    void searchByStartWords() {
        Person[] person = new Person[persons.length];

        System.out.println("Enter the Starting Word you want to Search for!");
        System.out.print("Answer : ");
        String search = scanner.next();

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].name.startsWith(search) || persons[i].surname.startsWith(search)) {
                person[i] = persons[i];
                person[i].printInfo(i + 1);
            }
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
