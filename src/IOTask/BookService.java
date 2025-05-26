package IOTask;

import java.io.*;

public class BookService {
    public static void main(String[] args) {
        String fileName = "books_data.txt";

        Book[] books = {
                new Book("Java Basics", "John Smith", 2010),
                new Book("OOP Concepts", "Jane Doe", 2015),
                new Book("Advanced Java", "Robert Martin", 2020)
        };

        try (BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fileName));
             ObjectOutputStream oos = new ObjectOutputStream(bout)
        ) {
            oos.writeObject(books);
            System.out.println("✅ Kitablar fayla yazıldı.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n Fayldan oxunan kitablar:");

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
             ObjectInputStream obin = new ObjectInputStream(bin)
        ) {
            Book[] readBook = (Book[]) obin.readObject();
            for (Book b : readBook){
                b.printInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
