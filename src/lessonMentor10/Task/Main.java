package lessonMentor10.Task;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethod = new PaymentMethod[3];

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        CouponPayment couponPayment = new CouponPayment();
        BalancePayment balancePayment = new BalancePayment();

        paymentMethod[0] = creditCardPayment;
        paymentMethod[1] = couponPayment;
        paymentMethod[2] = balancePayment;

        for (PaymentMethod payment : paymentMethod){
            payment.pay(20);
        }
    }
}
