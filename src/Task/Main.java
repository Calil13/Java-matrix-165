package Task;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Cinayət və cəza", 125);
        Book book2 = new Book("Ölülər", 30);

        library.addBook(book1);
        library.addBook(book2);

        library.takeBook("Cinayət və cəza");

        //library.giveBook("Cinayət və cəza");

        library.availableBook();
    }
}
