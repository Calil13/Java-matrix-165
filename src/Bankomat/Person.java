package Bankomat;

public class Person {
    String name;
    String surname;
    String personCardNumber;
    double personBalance;

    public Person(String name, String surname, String personCardNumber, double personBalance) {
        this.name = name;
        this.surname = surname;
        this.personCardNumber = personCardNumber;
        this.personBalance = personBalance;
    }

    public String getPersonCardNumber() {
        return personCardNumber;
    }

    public void setPersonCardNumber(String personCardNumber) {
        this.personCardNumber = personCardNumber;
    }

    public double getPersonBalance() {
        return personBalance;
    }

    public void setPersonBalance(double personBalance) {
        this.personBalance = personBalance;
    }
}
