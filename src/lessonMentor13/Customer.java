package lessonMentor13;

public class Customer extends Thread {
    private String name;
    private BankAccount account;
    private int withdrawBalance;

    public Customer(BankAccount account, String name, int withdrawBalance) {
        this.account = account;
        this.name = name;
        this.withdrawBalance = withdrawBalance;
    }

    public void run() {
        try {
            if (account.isActive) {
                account.withdraw(name, withdrawBalance);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
