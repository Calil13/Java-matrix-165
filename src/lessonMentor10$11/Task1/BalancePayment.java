package lessonMentor10$11.Task1;

public class BalancePayment extends PaymentMethod {
    private double balance = 100;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (amount < balance) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " AZN balansdan ödənildi." + " Yeni balans: " + balance);
        } else {
            throw new NotEnoughPaymentException("Balans kifayət etmir!");
        }
        return true;
    }
}
