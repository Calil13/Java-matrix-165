package BookStore;

public class BookStore {
    Book[] books = new Book[100];
    Book book;

    public void sellBook(Book book) {
        System.out.println();
        if (!book.isGetAvailable()) {
            throw new BookStoreException(book.getName() + " the book is already sold!");
        } else {
            book.isSetAvailable(false);
            System.out.println(book.getName() + " - it was sold.");
        }
    }
}
