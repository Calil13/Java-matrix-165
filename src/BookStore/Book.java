package BookStore;

public class Book {
    private boolean isAvailable;
    private String name;
    private String author;

    public boolean isGetAvailable() {
        return isAvailable;
    }

    public void isSetAvailable(boolean available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
