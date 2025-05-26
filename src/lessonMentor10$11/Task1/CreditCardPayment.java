package lessonMentor10$11.Task1;

public class CreditCardPayment extends PaymentMethod{
    public boolean pay(double amount){
        System.out.println(amount + " AZN kredit kartı ilə ödənildi!");
        return true;
    }
}
