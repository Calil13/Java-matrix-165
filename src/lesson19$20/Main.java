package lesson19$20;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Bank bank = new Bank();

        Card card1 = new Card("1234567", 500);
        Card card2 = new Card("1234568", 300);
        Card card3 = new Card("1234569", 400);

        bank.addCard(card1);
        bank.addCard(card2);
        bank.addCard(card3);

        Thread t1 = new Thread(new CardTransferTask(bank, card1, card2, 100), "T1");
        Thread t2 = new Thread(new CardTransferTask(bank, card1, card3, 150), "T2");
        Thread t3 = new Thread(new CardTransferTask(bank, card1, card2, 70), "T3");
        Thread t4 = new Thread(new CardTransferTask(bank, card1, card3, 50), "T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("\nFinal card balances:");
        for (Card card : bank.getCards()) {
            if (card != null) {
                System.out.println(card);
            }
        }
    }
}
