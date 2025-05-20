package lesson17;

public class CustomerService {
    public void register(Customer customer) throws ValidationException{
        if (customer.age < 18){
            throw new ValidationException("You are not old enough!");
        }

        if (customer.finCode.length() != 7){
            throw new ValidationException("The Finnish code must be 7 characters long!");
        }

        System.out.println("Successfully registered!");
    }
}
