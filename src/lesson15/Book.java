package lesson15;

public class Book {
    private String name;
    private String author;
    boolean isAvailable;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
        this.isAvailable = true;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    void printInfo(){
        System.out.println("Name of Book : " + name +
                "\nName of Author : " + author +
                "\nAvailable : " + isAvailable);
    }
}
