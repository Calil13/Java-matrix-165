package Bankomat;

import java.util.Objects;

public class Bank {
    private double bankBalance = 10000;
    User[] users = new User[10];
    int count = 0;

    public void addUser(User user) {
        if (user.getCardNumber().equals(user.personCardNumber)){
            if (count < users.length){
                users[count++] = user;
            } else {
                User[] newUser = new User[users.length * 2];
                for (int i = 0; i < users.length; i++) {
                    newUser[i] = users[i];
                }
                users = newUser;
            }
            users[count++] = user;
        } else {
            throw new InsufficientFundsException("Card number validation failed.");
        }
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}
