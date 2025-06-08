package Bankomat;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM(bank, 2000);

        Person person1 = new Person("Calil", "Ahmadov", "12345");
        Person person2 = new Person("Nurlana", "Azizova", "12346");

        User user1 = new User(person1, "12345", 500);
        User user2 = new User(person2, "12346", 1000);

        atm.withdraw(user1, 150);
        System.out.println(bank.getBankBalance());
    }
}
