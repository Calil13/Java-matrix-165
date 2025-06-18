package lessonMentor10$11.Task3;

public class Customer extends User {

    public Customer(String name, String surname) {
        super(name, surname);
    }

    public void printInfo(){
        System.out.println("Customer: " + getName() + " " + getSurname());
    }
}
