package lesson17;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(19, "Calil", "B123c4");

        CustomerService customerService = new CustomerService();

        try {
            customerService.register(customer);
        } catch (ValidationException e) {
            {
                System.out.println("Exception : " + e.getMessage());
            }
        }
    }
}
