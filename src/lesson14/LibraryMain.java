package lesson14;

import java.util.Arrays;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Xxx", "Yyy");
        Book book2 = new Book("Zzz", "Ccc");

        library.addBook(book1);
        library.addBook(book2);

        library.takeBook("Xxx");

        library.availableBook();

        library.returnBook("Xxx");

        library.availableBook();
    }
}
