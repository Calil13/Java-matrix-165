package BookStore;

public class AddBookDepo {
    Book book;
    Book[] depoBook = new Book[100];
    double maxPurchasePrice = 30;
    int count = 0;

    public void addBook(Book book, double purchasePrice) {
        if (purchasePrice > maxPurchasePrice) {
            throw new BookStoreException("This book is more expensive than 30 AZN.");
        }

        book.isSetAvailable(true);
        System.out.println(book.getName() + " - book added to depot.");
        depoBook[count++] = book;
    }

    public void availableBooks(){
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.println("\"" + depoBook[i].getName() + "\" book is available in the store.");
        }
    }
}
