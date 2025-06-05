package Bankomat;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Calil", 19);
        Person person2 = new Person("Nurlana", 19);

        User user1 = new User(person1, "12345", 500);
        User user2 = new User(person1, "12346", 800);

        ATM atm1 = new ATM(user1);

        atm1.withdraw(user1, 200);
    }
}
