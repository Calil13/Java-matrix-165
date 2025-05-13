package lesson15;

public class Users {
    Book[] books = new Book[100];
    String name;
    int age;
    int countBook = 0;

    Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addUserBook(Book book) {
        if (countBook < books.length) {
            books[countBook++] = book;
        }
    }

    public void deletBook(String bookName){
        for (int i = 0; i < countBook; i++) {
            if (books[i] != null && books[i].getName().equals(bookName)){
                books[--countBook] = null;
                break;
            }
        }
    }

    public void listMyBooks() {
        System.out.println();
        System.out.println(name + "'s Books : ");
        if (countBook == 0) {
            System.out.println("No books currently taken.");
        }else {
            for (int i = 0; i < countBook; i++) {
                books[i].printInfo();
                System.out.println("--------------");
            }
        }
    }
}

