package Bankomat;

public class ATM {
    double userBalance;
    private double balance;

    public ATM(User user1) {
        this.userBalance = user1.balance;
    }

    public synchronized void withdraw(User user, double amount){
        System.out.println(user.name + " is trying to withdraw " + amount + "AZN.");

        if (amount > balance){
            throw new InsufficientFundsException("Insufficient balance! Available:" + balance);
        }

        balance -= amount;
        userBalance -= amount;

        System.out.println(user.name + " successfully withdrew " + amount + " AZN. Remaining balance: " + balance + " AZN.");
        System.out.println(user + "'s current balance: " + userBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
