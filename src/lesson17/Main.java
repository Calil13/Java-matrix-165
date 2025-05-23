package lesson17;

public class Main {
    public static void main(String[] args) throws ValidationException {
        Customer customer = new Customer(15, "Calil", "B123c4");

        CustomerService customerService = new CustomerService();

//        try {
//            customerService.register(customer);
//        } catch (ValidationException e) {
//            {
//                System.out.println("Exception : " + e.getMessage());
//            }
//        }

        customerService.register(customer);
    }
}
