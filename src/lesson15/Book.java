package lesson15;

public class Book {
    private String name;
    private String author;
    boolean isAvailable;

    public void setName(){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAuthor(){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

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
