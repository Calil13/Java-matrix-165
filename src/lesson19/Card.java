package lesson19;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;

public class Card implements Serializable {
    private String carNO;
    private double balance;
    final String file = "Bank.txt";

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