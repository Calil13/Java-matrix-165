package lessonMentor14.Task2;

public class Main {
    public static void main(String[] args) {
        TaskMethod taskMethod = new TaskMethod();
        Person person = new Person();

        System.out.println("before : ");
        person.setName("Person1");
        person.setAge(17);

        System.out.println("after : ");
        taskMethod.method(person, "Person2");
    }
}
