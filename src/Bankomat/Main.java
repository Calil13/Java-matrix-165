package Bankomat;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM(bank, 2000);

        Person person1 = new Person("Calil", "Ahmadov", "12345", 1200);
        Person person2 = new Person("Nurlana", "Azizova", "12346", 800);

        AtmUser atmUser1 = new AtmUser(person1, "12345");
        AtmUser atmUser2 = new AtmUser(person2, "12346");

        atm.withdraw(atmUser1, 300);
        atm.withdraw(atmUser2, 500);

        System.out.println(bank.getBankBalance());
    }
}
