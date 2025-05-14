package lessonMentor10;

public class Order {
    private Customer customer;
    private Book[] books;
    int bookCount = 0;

    public Order(Customer customer) {
        this.customer = customer;
        this.books = new Book[5];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
            if (bookCount > 5) {
                System.out.println("Maximum of 5 Books can be added!");
            } else {
                books[bookCount++] = book;
        }
    }

    public double getTotalPrice(){
        double total = 0;
        for (int i = 0; i < bookCount; i++) {
            total += books[i].getPrice();
        }
        return total;
    }

    public void printOrderDetails(){
        customer.printInfo();
        System.out.println("Order includes:");
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
        System.out.println("Total Price: " + getTotalPrice());
    }
}
