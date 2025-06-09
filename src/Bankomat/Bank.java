package Bankomat;

public class Bank {
    private double bankBalance = 10000;
    AtmUser[] users = new AtmUser[10];
    int count = 0;

    public void addUser(AtmUser user) {
        if (user.getCardNumber().equals(user.personCardNumber)) {
            if (count < users.length) {
                users[count++] = user;
            } else {
                AtmUser[] newUser = new AtmUser[users.length * 2];
                for (int i = 0; i < users.length; i++) {
                    newUser[i] = users[i];
                }
                users = newUser;
            }
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
