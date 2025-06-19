package BookStore;

public class AddBookDepo {
    Book[] depoBook = new Book[100];
    String bookName;
    double purchasePrice;
    double maxPurchasePrice = 30;
    int count = 0;

    public void addBook(Book book, double purchasePrice) {
        if (purchasePrice > maxPurchasePrice) {
            throw new BookStoreException("This book is more expensive than 30 AZN.");
        }

        depoBook[count++] = book;
    }
}
