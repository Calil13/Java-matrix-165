package lesson15;

public class Book {
    private String BookName;
    private String author;
    private int pickUpAge;
    boolean isAvailable;

    public Book(String name, String author, int pickUpAge){
        this.BookName = name;
        this.author = author;
        this.pickUpAge = pickUpAge;
        this.isAvailable = true;
    }

    public void setBookName(String bookName){
        this.BookName = bookName;
    }

    public String getBookName(){
        return BookName;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPickUpAge(int pickUpAge) {
        this.pickUpAge = pickUpAge;
    }

    public int getPickUpAge() {
        return pickUpAge;
    }

    void printInfo(){
        System.out.println("Name of Book : " + BookName +
                "\nName of Author : " + author +
                "\nAvailable : " + isAvailable);
    }
}
