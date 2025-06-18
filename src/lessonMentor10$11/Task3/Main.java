package lessonMentor10$11.Task3;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Calil", "Ahmadov");

        Book book1 = new Book("Java", "John Doe", 15);
        Book book2 = new Book("OOP", "Jane Smith", 20);

        Order order = new Order(customer);

        order.addBook(book1);
        order.addBook(book2);
        order.printOrderDetails();
    }
}
