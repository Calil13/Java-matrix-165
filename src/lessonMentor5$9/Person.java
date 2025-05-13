package lessonMentor5$9;

public class Person {
    static String name;
    static String surname;
    static int age;
    static boolean gender;

    void printInfo(int i) {
        System.out.println(i + "." +
                "\nName : " + name +
                "\nSurname : " + surname +
                "\nAge  : " + age +
                "\nGender : " + (gender ? "Male" : "Female"));
        System.out.println("--------------");
    }
}

