package lesson14;

public class Library {
    Book[] books = new Book[100];
    int count = 0;

    void addBook(Book book) {
        if (count < 100) {
            books[count] = book;
            count++;
            System.out.println(book.name + "," + book.author + " - Book added!");
        } else {
            System.out.println("Library is Full!");
        }
    }

    void takeBook(String name) {
        System.out.println();
        for (Book book : books) {
            if (book.name.equals(name) && book.isAvailable) {
                book.isAvailable = false;
                System.out.println("Book was Taken! : " + name);
                System.out.println();
                return;
            } else {
                System.out.println("There is no such book!");
                System.out.println();
            }
        }
    }

    void returnBook(String name) {
        System.out.println();
        for (Book book : books) {
            if (book.name.equals(name) && !book.isAvailable) {
                book.isAvailable = true;
                System.out.println("Book was returned : " + name);
                System.out.println();
                return;
            } else {
                System.out.println("No such book found! : " + name);
                System.out.println();
            }
        }
    }

    void availableBook() {
        System.out.println("Available books : ");
        for (int i = 0; i < count; i++) {
            if (books[i].isAvailable) {
                books[i].printInfo();
                System.out.println("--------------");
            }
        }
    }
}
