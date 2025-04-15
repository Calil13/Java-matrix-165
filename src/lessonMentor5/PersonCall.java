package lessonMentor5;

public class PersonCall {
    public static void main(String[] args) {
        Person person = new Person();

        String name = person.getName();
        String surname = person.getSurname();
        int age = person.getAge();
        String dateOfBirt = person.getDateOfBirth();

        System.out.println();

        System.out.println("----- Person Info -----");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirt);
    }
}
