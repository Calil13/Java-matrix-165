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

        Card[] cards1 = bank.getCards();
        if (cards1 != null || cards1.length != 0){
            for (Card card : cards1) {
                if (card != null) {
                    System.out.println(card);
                } else {
                    break;
                }
            }
        }

        bank.cardToCard(card3, card1, 50);
    }
}
