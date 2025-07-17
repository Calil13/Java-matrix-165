package lessonMentor14.Task2;

public class Main {
    public static void main(String[] args) {
        //Her hansi sinifin her hansi private field-ini update eden(deyerini deyisen)  metod

        TaskMethod taskMethod = new TaskMethod();
        Person person = new Person();

        System.out.println("Before : ");
        System.out.println(person.getAge() + ", " + person.getName());

        System.out.println("After : ");
        taskMethod.changeField(person, "name", "Person2");
        taskMethod.changeField(person, "age", 25);
        System.out.println(person.getAge() + ", " + person.getName());
    }
}
