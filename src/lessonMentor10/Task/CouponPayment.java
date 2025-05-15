package lessonMentor10.Task;

public class CouponPayment extends PaymentMethod{
    private double coupon = 50;

    public double getCoupon() {
        return coupon;
    }

    public void setCoupon(double coupon) {
        this.coupon = coupon;
    }

    public boolean pay(double amount){
        if (getCoupon() >= amount){
            setCoupon(getCoupon() - amount);
            System.out.println(amount + " AZN kuponla ödənildi." + " Qalan kupon: " + coupon);
        }else {
            System.out.println("Kupon kifayət etmir!");
        }
        return true;
    }
}
