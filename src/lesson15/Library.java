package lesson15;

public class Library {
    Book[] books = new Book[100];
    int count = 0;

    public void addBook(Book book) {
        if (count < 100) {
            books[count] = book;
            count++;
            System.out.println(book.getName() + "," + book.getAuthor() + " - Book added!");
        } else {
            System.out.println("Library is Full!");
        }
    }

    public void takeBook(String name) {
        System.out.println();
        for (Book book : books) {
            if(book == null) break;
            if (book.getName().equals(name) && book.isAvailable) {
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

    public void returnBook(String name) {
        System.out.println();
        for (Book book : books) {
            if(book == null) break;
            if (book.getAuthor().equals(name) && !book.isAvailable) {
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

    public void availableBook() {
        System.out.println("Available books : ");
        for (int i = 0; i < count; i++) {
            if (books[i].isAvailable) {
                books[i].printInfo();
                System.out.println("--------------");
            }
        }
    }
}
