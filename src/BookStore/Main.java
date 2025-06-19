package BookStore;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        AddBookDepo addBookDepo = new AddBookDepo();

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();

        addBookDepo.addBook(book1, 15);
        addBookDepo.addBook(book2, 8);
        addBookDepo.addBook(book3, 20);
        addBookDepo.addBook(book4, 31);

        bookStore.sellBook(book2);
        bookStore.sellBook(book3);
    }
}
