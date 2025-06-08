package Bankomat;

public class User extends Person{
    Bank bank;
    Person person;
    private String cardNumber;
    private double balance;

    public User(Person person, String cardNumber, double balance) {
        super(person.name, person.surname, person.personCardNumber);
        this.person = person;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void decreaseBalance(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
