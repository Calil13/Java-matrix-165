package lessonMentor13;

public class BankAccount {
    int balance = 10000;
    public volatile boolean isActive = true;

    public synchronized void withdraw(String user, int amount) throws InterruptedException {
        if (!isActive) {
            System.out.println("The system is disabled.");
        }

        if (balance > amount) {
            System.out.println(user + " withdraw the balance : " + amount + "AZN");
            balance -= amount;
            System.out.println("Remaining balance : " + balance + "AZN");
            Thread.sleep(2000);
        } else {
            System.out.println("The balance is not enough.");
            isActive = false;
        }
    }
}
