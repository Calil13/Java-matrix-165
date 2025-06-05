package lesson19$20;

import java.io.IOException;

public class Bank {
    public static final String FILE_NAME = "bank.txt";

    public synchronized void addCard(Card card) throws IOException, ClassNotFoundException {
        Card[] cards = FileManager.readFromFile(FILE_NAME);
        if (cards == null) {
            cards = new Card[100];
            cards[0] = card;
            FileManager.writeToFile(FILE_NAME, cards);
        } else {
            for (int i = 0; i < cards.length; i++) {
                if (cards[i] == null) {
                    cards[i] = card;
                    break;
                }
            }
            FileManager.writeToFile(FILE_NAME, cards);
        }
    }

    public synchronized void cardToCard(Card from, Card to, double payment) throws IOException, ClassNotFoundException {
        Card[] cards = FileManager.readFromFile(FILE_NAME);
        Card fromCard = null;
        Card toCard = null;

        for (Card card : cards) {
            if (card != null && card.getCarNO().equals(from.getCarNO())) {
                fromCard = card;
            }

            if (card != null && card.getCarNO().equals(to.getCarNO())) {
                toCard = card;
            }
        }

        if (fromCard != null && toCard != null) {
            if (fromCard.getBalance() >= payment) {
                fromCard.setBalance(from.getBalance() - payment);
                toCard.setBalance(toCard.getBalance() + payment);
                System.out.println(Thread.currentThread().getName() + " transferred " + payment + "AZN from " + fromCard.getCarNO() + " to " + toCard.getCarNO());
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Card not found.");
        }
        FileManager.writeToFile(FILE_NAME, cards);
    }

    public Card[] getCards() throws IOException, ClassNotFoundException {
        return FileManager.readFromFile(FILE_NAME);
    }
}
