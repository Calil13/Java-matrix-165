package lessonMentor10;

public class Book {
    private String BookName;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.BookName = name;
        this.author = author;
        this.price = price;
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

    public void setPrice(double price){
        if (price < 0){
            System.out.println("Price is Less than 0!");
        }else {
            this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }

    public void printInfo(){
        System.out.println("Book : " + getBookName() + " by " + getAuthor() + ", Price: " + getPrice());
    }
}
