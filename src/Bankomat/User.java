package Bankomat;

public class User extends Person{
    Person person;
    String cardNumber;
    double balance;

    public User(Person person, String cardNumber, double balance) {
        super(person.name, person.age);
        this.person = person;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
