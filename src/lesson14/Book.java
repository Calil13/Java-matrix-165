package lesson14;

public class Book {
    String name;
    String author;
    boolean isAvailable;

    Book(String name, String author){
        this.name = name;
        this.author = author;
        this.isAvailable = true;
    }

    void printInfo(){
        System.out.println("Name of Book : " + name +
                "\nName of Author : " + author +
                "\nAvailable : " + isAvailable);
    }
}
