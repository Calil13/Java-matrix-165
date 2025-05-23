package lesson15;

import lessonMentor10$11.User;

public class Library {
    Book[] books = new Book[100];
    Users[] users = new Users[100];
    int count = 0;

    public void addBook(Book book) {
        if (count < 100) {
            books[count] = book;
            count++;
            System.out.println(book.getBookName() + "," + book.getAuthor() + " - Book added!");
        } else {
            System.out.println("Library is Full!");
        }
    }

    public void takeBook(String name, Users user) {
        System.out.println();

        if (isUserExists(user)) {
            throw new ValidationException("User not found!");
        }

        for (Book book : books) {
            if (book == null) break;
            if (book.getBookName().equals(name)) {
                if (!book.isAvailable){
                    throw new ValidationException("Book has already been taken!");
                }

                if (user.age < book.getPickUpAge()) {
                    throw new ValidationException("Age is not enough");
                }

                book.isAvailable = false;
                user.addUserBook(book);
                System.out.println(user.UserName + " Took it! : " + name);
                return;
            }
        }

        throw new ValidationException("There is no such book!");
    }

    public void returnBook(String name, Users user) {
        System.out.println();
        for (Book book : books) {
            if (book == null) break;
            if (book.getBookName().equals(name) && !book.isAvailable) {
                book.isAvailable = true;
                user.deleteBook(name);
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
        System.out.println();
        System.out.println("Available books : ");
        for (int i = 0; i < count; i++) {
            if (books[i].isAvailable) {
                books[i].printInfo();
                System.out.println("--------------");
            }
        }
    }

    private boolean isUserExists(Users user) {
        for (Users u : users) {
            if (u == null) break;
            if (u.equals(user)) return true;
        }
        return false;
    }
}
