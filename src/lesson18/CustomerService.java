package lesson18;

import java.io.*;

public class CustomerService {
    public void registeredCustomer(Customer c) throws IOException {
        try (FileOutputStream f = new FileOutputStream("test.txt");
             ObjectOutputStream o = new ObjectOutputStream(f)) {
            o.writeObject(c);

        } catch (IOException e) {
            System.out.println();
        }
    }

    public Customer readCustomer() throws ClassNotFoundException {
        try (FileInputStream f = new FileInputStream("test.txt");
             ObjectInputStream o = new ObjectInputStream(f);
        ) {
            Customer customer = (Customer) o.readObject();
            return customer;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println();
        }
        return null;
    }
}