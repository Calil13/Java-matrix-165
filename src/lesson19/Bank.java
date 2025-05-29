package lesson19;

import java.io.IOException;

public class Bank {
    public static final String FILE_NAME = "bank.txt";

    public void addCard(Card card) throws IOException, ClassNotFoundException {
        Card[] cards = FileManager.readFromFile(FILE_NAME);
        if (cards == null){
            cards = new Card[100];
            cards[0] = card;
            FileManager.writeToFile(FILE_NAME, cards);
        } else {
            for (int i = 0; i < cards.length; i++) {
                if(cards[i] == null){
                    cards[i] = card;
                    break;
                }
            }
            FileManager.writeToFile(FILE_NAME, cards);
        }
    }

    public void cardToCard(Card from, Card to){

    }

    public Card[] getCards() throws IOException, ClassNotFoundException {
        return FileManager.readFromFile(FILE_NAME);
    }
}
