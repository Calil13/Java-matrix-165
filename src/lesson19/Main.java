package lesson19;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bank bank = new Bank();
        Card card1 = new Card("1234567", 100);
        Card card2 = new Card("1234568", 200);
        Card card3 = new Card("1234569", 300);

        bank.addCard(card1);
        bank.addCard(card2);
        bank.addCard(card3);

        Card[] cards = bank.getCards();
        if (cards != null || cards.length != 0){
            for (Card card : cards) {
                if (card != null) {
                    System.out.println(card);
                } else {
                    break;
                }
            }
        }
    }
}
