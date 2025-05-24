package lesson15;

public class Users {
    Book[] books = new Book[100];
    String UserName;
    int age;
    int countBook = 0;

    Users(String name, int age) {
        this.UserName = name;

        if (age < 7){
            throw new ValidationException("Age less than 7!");
        }

        this.age = age;
    }

    public String getUserName() {
        return UserName;
    }

    public int getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addUserBook(Book book) {
        if (countBook < books.length) {
            books[countBook++] = book;
        }
    }

    public void deleteBook(String bookName){
        for (int i = 0; i < countBook; i++) {
            if (books[i] != null && books[i].getBookName().equals(bookName)){
                books[--countBook] = null;
                break;
            }
        }
    }

    public void listMyBooks() {
        System.out.println();
        System.out.println(UserName + "'s Books : ");
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

