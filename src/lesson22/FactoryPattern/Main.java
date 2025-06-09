package lesson22.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        SchoolFactory schoolFactory = new SchoolFactory();

        School lesson1 = schoolFactory.createSchool("Student");
        lesson1.lesson();

        School lesson2 = schoolFactory.createSchool("Teacher");
        lesson2.lesson();

        School lesson3 = schoolFactory.createSchool("principal");
        lesson3.lesson();
    }
}
