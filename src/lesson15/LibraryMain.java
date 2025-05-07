package lesson15;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Aaa", "Bbb");
        Book book2 = new Book("Zzz", "Ccc");

        library.addBook(book1);
        library.addBook(book2);

        library.takeBook("Aaa");

        library.availableBook();

        library.returnBook("Aaa");

        library.availableBook();
    }
}
