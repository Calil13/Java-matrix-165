package lessonMentor10$11.Task1;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethod = new PaymentMethod[3];

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        CouponPayment couponPayment = new CouponPayment();
        BalancePayment balancePayment = new BalancePayment();

        paymentMethod[0] = creditCardPayment;
        paymentMethod[1] = couponPayment;
        paymentMethod[2] = balancePayment;

        try {
            for (PaymentMethod payment : paymentMethod) {
                payment.pay(200);
            }
        } catch (NotEnoughPaymentException n) {
            System.out.println(n.getMessage());
        }
    }
}
