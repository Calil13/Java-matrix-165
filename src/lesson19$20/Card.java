package lesson19$20;

import java.io.Serializable;

public class Card implements Serializable {
    private String carNO;
    private double balance;
    static final String file = "BankBalances.txt";

    public Card(String carNO, double balance) {
        this.carNO = carNO;
        this.balance = balance;
    }

    public String getCarNO() {
        return carNO;
    }

    public void setCarNO(String carNO) {
        this.carNO = carNO;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "carNO='" + carNO + '\'' +
                ", balance=" + balance +
                ", file='" + file + '\'' +
                '}';
    }
}