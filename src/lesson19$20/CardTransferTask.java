package lesson19$20;

import java.io.IOException;

public class CardTransferTask implements Runnable{
    private final Bank bank;
    private final Card from;
    private final Card to;
    private final double amount;

    public CardTransferTask(Bank bank, Card from, Card to, double amount) {
        this.bank = bank;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }


    @Override
    public void run() {
        try {
            bank.cardToCard(from, to, amount);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
