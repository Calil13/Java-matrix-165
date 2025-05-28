package lesson15;

import java.io.*;

public class Library {
    Book[] books = new Book[100];
    Users[] users = new Users[100];
    int countBook = 0;
    int countUser = 0;

    public void addBook(Book book) {
        if (countBook < 100) {
            books[countBook] = book;
            countBook++;
            saveBooksToFile();
            System.out.println(book.getBookName() + "," + book.getAuthor() + " - Book added!");
        } else {
            System.out.println("Library is Full!");
        }
    }

    public void addUser(Users user) {
        if (countUser < users.length) {
            users[countUser++] = user;
            saveUserToFile();
            System.out.println(user.UserName + " - User added!");
        } else {
            System.out.println("User list is full!");
        }
    }

    public void takeBook(String name, Users user) {
        System.out.println();

        for (Book book : books) {
            if (book == null) break;
            if (book.getBookName().equals(name)) {
                if (!book.isAvailable) {
                    throw new ValidationException("Book has already been taken!");
                }

                if (user.age < book.getPickUpAge()) {
                    throw new ValidationException("Age is not enough");
                }

                book.isAvailable = false;
                user.addUserBook(book);
                saveBooksToFile();
                saveUserToFile();
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
                saveBooksToFile();
                saveUserToFile();
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
        for (int i = 0; i < countBook; i++) {
            if (books[i].isAvailable) {
                books[i].printInfo();
                System.out.println("--------------");
            }
        }
    }

    public void saveBooksToFile() {
        try (ObjectOutputStream outBook = new ObjectOutputStream(new FileOutputStream("books.txt"))) {
            outBook.writeObject(books);
        } catch (IOException e) {
            throw new ValidationException("Error saving books to file!");
        }
    }

    public void readBookFromFile() {
        try (ObjectInputStream inBook = new ObjectInputStream(new FileInputStream("books.txt"))) {
            books = (Book[]) inBook.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new ValidationException("Error loading books from file!");
        }
    }

    public void saveUserToFile() {
        try (ObjectOutputStream outUser = new ObjectOutputStream(new FileOutputStream("users.txt"))) {
            outUser.writeObject(users);
        } catch (IOException e) {
            throw new ValidationException("Error saving users to file");
        }
    }

    public void readUserFromFile() {
        try (ObjectInputStream inUser = new ObjectInputStream(new FileInputStream("users.txt"))) {
            users = (Users[]) inUser.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new ValidationException("Error loading users from file!");
        }
    }
}
