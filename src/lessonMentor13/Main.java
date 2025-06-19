package lessonMentor13;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer customer1 = new Customer(account, "User1", 500);
        Customer customer2 = new Customer(account, "User2", 250);
        Customer customer3 = new Customer(account, "User3", 100);
        Customer customer4 = new Customer(account, "User4", 1000);
        Customer customer5 = new Customer(account, "User5", 2000);

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();
    }
}
