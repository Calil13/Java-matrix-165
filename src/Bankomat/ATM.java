package Bankomat;

public class ATM extends Bank {
    Bank bank;
    AtmUser user;
    private double atmBalance;
    int count;

    public ATM(Bank bank, double atmBalance) {
        this.bank = bank;
        this.atmBalance = atmBalance;
    }

    public synchronized void withdraw(AtmUser user, double amount) {
        System.out.println(user.name + " is trying to withdraw " + amount + "AZN.");

        bank.addUser(user);

        if (bank.getBankBalance() > amount) {
            if (amount > atmBalance) {
                throw new InsufficientFundsException("Insufficient atmBalance! Available:" + atmBalance);
            } else {
                atmBalance -= amount;
                bank.setBankBalance(bank.getBankBalance() - amount);
            }

            if (user.getPersonBalance() < amount) {
                throw new InsufficientFundsException("Insufficient userBalance! Available:" + user.getPersonBalance());
            } else {
                user.setPersonBalance(user.getPersonBalance() - amount);
            }

            System.out.println(user.name + " successfully withdrew " + amount + " AZN. Remaining usrBalance: " + user.getPersonBalance() + " AZN.");
            System.out.println(user.name + " " + user.surname + "'s current kart balance: " + user.getPersonBalance());
        } else {
            throw new InsufficientFundsException("The bank cannot pay you this amount!");
        }
    }

    public double getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(double atmBalance) {
        this.atmBalance = atmBalance;
    }
}
