package lessonMentor13.Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Customer customer1 = new Customer(account, "User1", 500);
        Customer customer2 = new Customer(account, "User2", 250);
        Customer customer3 = new Customer(account, "User3", 100);
        Customer customer4 = new Customer(account, "User4", 1000);

        customer1.start();
        customer1.join();

        customer2.start();
        customer2.join();

        customer3.start();
        customer3.join();

        customer4.start();
        customer4.join();
    }
}
