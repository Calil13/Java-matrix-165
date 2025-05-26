package IOTask;

import java.io.Serializable;

public class Book implements Serializable {
    String name;
    String author;
    int year;

    public Book(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.year = age;
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("--------------");
    }
}
