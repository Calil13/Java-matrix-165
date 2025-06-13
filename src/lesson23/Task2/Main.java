package lesson23.Task2;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ReflectionMethod reflection = new ReflectionMethod();
        Person person = new Person();

        reflection.setField(person, "name", "Calil");
        reflection.setField(person, "age", 19);
        person.info();
    }
}
