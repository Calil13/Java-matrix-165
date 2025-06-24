package BookStore;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        AddBookDepo addBookDepo = new AddBookDepo();

        Book book1 = new Book("Java", "Mehmet");
        Book book2 = new Book("Algorithm", "John");
        Book book3 = new Book("Cinayət və Cəza", "Fyodor Dostoyevski");

        addBookDepo.addBook(book1, 15);
        addBookDepo.addBook(book2, 8);

        bookStore.sellBook(book2);

        addBookDepo.availableBooks();
    }
}
