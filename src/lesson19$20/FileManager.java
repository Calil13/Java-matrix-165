package lesson19$20;

import java.io.*;

public class FileManager {

    public synchronized static Card[] readFromFile(String fileName) throws IOException, ClassNotFoundException {
        Card[] cards = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            cards = (Card[]) ois.readObject();
        } catch (EOFException e){
            return cards;
        }
        return cards;
    }

    public synchronized static void writeToFile(String fileName, Card[] cards) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bufferedOutputStream)
        ) {
            oos.writeObject(cards);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
