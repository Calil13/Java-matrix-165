package Bankomat;

public class Person {
    String name;
    String surname;
    String personCardNumber;

    public Person(String name, String surname, String personCardNumber) {
        this.name = name;
        this.surname = surname;
        this.personCardNumber = personCardNumber;
    }

    public String getPersonCardNumber() {
        return personCardNumber;
    }

    public void setPersonCardNumber(String personCardNumber) {
        this.personCardNumber = personCardNumber;
    }
}
