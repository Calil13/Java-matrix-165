package lessonMentor5;

public class Person {
    String name;
    String surname;
    int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name : " + name +
                "\nSurname : " + surname +
                "\nAge  : " + age);
        System.out.println();
    }
}
