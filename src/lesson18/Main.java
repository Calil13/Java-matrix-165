package lesson18;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Customer customer = new Customer("Calil", 19);
        CustomerService service = new CustomerService();

        service.registeredCustomer(customer);
        System.out.println(customer);

        service.readCustomer();
    }
}
