package Task;

public class Book {
    String bookName;
    int price;
    boolean isAvailable;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
        this.isAvailable = true;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
