package lessonMentor5$6$7;

public class Person {
    String name;
    String surname;
    int age;
    boolean gender;

    void printInfo(int i) {
        System.out.println(i + "." +
                "\nName : " + this.name +
                "\nSurname : " + this.surname +
                "\nAge  : " + this.age +
                "\nGender : " + (this.gender ? "Male" : "Female"));
        System.out.println("--------------");
    }
}

