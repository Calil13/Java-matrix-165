package lessonMentor5$9and12;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PersonOperation {
    static Person[] persons = null;
    Scanner scanner = new Scanner(System.in);

    Person fillAndGetPersons() {
        Person person = new Person();
        System.out.println("Enter Name : ");
        String name = scanner.next();
        person.setName(name);

        System.out.println("Enter Surname : ");
        String surname = scanner.next();
        person.setSurname(surname);

        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        person.setAge(age);

        System.out.println("Enter gender(True - Male, False - Female) : ");
        boolean gender = scanner.nextBoolean();
        person.setGender(gender);

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
                    "\n9 - Add Excel!" +
                    "\n10 - Exit!"
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
                    addExcel();
                case 10:
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

    void update2() {
        System.out.println("Which registration do you want to change?");
        showAll();
        System.out.print("Answer : ");
        int index = scanner.nextInt();
        Person person = persons[--index];

        System.out.println();

        System.out.println("Which information in this registry do you want to change? " +
                "(name, surname, age, gender)");

        System.out.print("Answer : ");
        scanner.nextLine();
        String changeInfo = scanner.nextLine();
        String[] array = changeInfo.split(",");

        for (String s : array) {
            String space = s.trim();

            if (space.equalsIgnoreCase("name")) {
                System.out.println("Enter Name : ");
                String name = scanner.next();
                person.setName(name);

            } else if (space.equalsIgnoreCase("surname")) {
                System.out.println("Enter surname : ");
                String surname = scanner.next();
                person.setSurname(surname);

            } else if (space.equalsIgnoreCase("age")) {
                System.out.println("Enter age : ");
                int age = scanner.nextInt();
                person.setAge(age);

            } else if (space.equalsIgnoreCase("gender")) {
                System.out.println("Enter gender : ");
                boolean gender = scanner.nextBoolean();
                person.setGender(gender);

            } else {
                System.out.println("Information is incorrect!");
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
                String name = scanner.next();
                person.setName(name);
                System.out.println("\n--------------");
                break;
            case 2:
                System.out.println("Enter Surname : ");
                String surname = scanner.next();
                person.setSurname(surname);
                System.out.println("\n--------------");
                break;
            case 3:
                System.out.println("Enter age : ");
                int age = scanner.nextInt();
                person.setAge(age);
                System.out.println("\n--------------");
                break;
            case 4:
                System.out.println("Enter gender(True - Male, False - Female) : ");
                boolean gender = scanner.nextBoolean();
                person.setGender(gender);
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
                    if (persons[i].getName().equals(name)) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 2:
                System.out.print("Enter Surname : ");
                String surname = scanner.next();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].getSurname().equals(surname)) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 3:
                System.out.print("Enter age : ");
                int age = scanner.nextInt();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].getAge() == age) {
                        persons[i].printInfo(i + 1);
                    }
                }
                break;
            case 4:
                System.out.print("Enter Gender : ");
                boolean gender = scanner.nextBoolean();
                System.out.println("\n--------------");
                for (int i = 0; i < persons.length; i++) {
                    if (persons[i].getGender() == gender) {
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
            if (persons[i].getName().startsWith(search) || persons[i].getSurname().startsWith(search)) {
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

    void addExcel() {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("People");

        // Header row
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Name");
        header.createCell(1).setCellValue("Age");
        header.createCell(2).setCellValue("Email");

        // Data rows
        try {
            for (int i = 0; i < persons.length; i++) {
                Person p = persons[i];
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(p.getName());
                row.createCell(1).setCellValue(p.getAge());
                row.createCell(2).setCellValue(p.getEmail());
            }
        } catch (Exception e) {
            throw new ValindationException("Persons not found!");
        }

        try (FileOutputStream out = new FileOutputStream("people.xlsx")) {
            workbook.write(out);
            workbook.close();
            System.out.println("Excel faylı yaradıldı: people.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
