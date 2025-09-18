package Task;

public class Library {
    Book[] books = new Book[100];
    int countBook = 0;

    public void addBook(Book book) {
        if (countBook <= 100) {
            books[countBook] = book;
            countBook++;
            System.out.println(book.getBookName() + " - Book added!");
        } else {
            System.out.println("Library is full!");
        }
    }

    public void takeBook(String name) {

        for (Book book : books) {
            if (book == null) break;

            if (book.getBookName().equals(name)) {
                if (!book.isAvailable) {
                    System.out.println("Book is already taken!");
                    break;
                }

                book.isAvailable = false;
                System.out.println(book.getBookName() + " - was taken!");
            }
        }
    }

    public void giveBook(String name) {
        for (Book book : books) {
            if (book == null) break;
            if (book.getBookName().equals(name) && !book.isAvailable){
                book.isAvailable = true;
                System.out.println("Book was returned!");
            }
        }
    }

    public void availableBook() {
        System.out.println("------------");
        for (Book book : books) {
            if (book == null) break;
            if (book.isAvailable) {
                System.out.println(book.getBookName());
            }
        }
    }
}
