package Bankomat;

public class AtmUser extends Person{
    Person person;
    private String cardNumber;

    public AtmUser(Person person, String cardNumber) {
        super(person.name, person.surname, person.personCardNumber, person.personBalance);
        this.person = person;
        this.cardNumber = cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + personBalance +
                '}';
    }
}
