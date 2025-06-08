package Bankomat;

import java.util.Objects;

public class ATM extends Bank {
    Bank bank;
    User user;
    private double atmBalance;
    int count;

    public ATM(Bank bank, double atmBalance) {
        this.bank = bank;
        this.atmBalance = atmBalance;
    }

    public synchronized void withdraw(User user, double amount) {
        System.out.println(user.name + " is trying to withdraw " + amount + "AZN.");

        bank.addUser(user);

        if (bank.getBankBalance() > amount) {
            if (amount > atmBalance) {
                throw new InsufficientFundsException("Insufficient atmBalance! Available:" + atmBalance);
            } else {
                atmBalance -= amount;
                bank.setBankBalance(getBankBalance() - amount);
            }

            if (user.getBalance() < amount) {
                throw new InsufficientFundsException("Insufficient userBalance! Available:" + user.getBalance());
            } else {
                user.setBalance(user.getBalance() - amount);
            }

            System.out.println(user.name + " successfully withdrew " + amount + " AZN. Remaining usrBalance: " + user.getBalance() + " AZN.");
            System.out.println(user.name + " " + user.surname + "'s current atmBalance: " + user.getBalance());
        }
    }

    public double getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(double atmBalance) {
        this.atmBalance = atmBalance;
    }
}
