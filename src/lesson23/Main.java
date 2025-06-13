package lesson23;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService();

        Person person1 = new Person("Person 1", 20);
        Person person2 = new Person("Person 2", 15);

        service.check(person1.getClass().getDeclaredFields(), person1.getAge());
        service.check(person2.getClass().getDeclaredFields(), person2.getAge());
    }
}
