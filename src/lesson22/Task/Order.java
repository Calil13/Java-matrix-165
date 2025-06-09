package lesson22.Task;

public class Order {
    private double amount;
    private OrderStatus orderStatus;

    public Order(double amount){
        this.amount = amount;
        this.orderStatus = OrderStatus.CREATED;
    }

    public void changeStatusOfOrder(OrderStatus newStatus){
        if (this.orderStatus.canBeChangedTo(newStatus)){
            this.orderStatus = newStatus;
            System.out.println("Status changed: " + orderStatus);
        } else {
            throw new InvalidStatusTransitionException("It is not allowed to change from " + this.orderStatus + " status to " + newStatus + " status!");
        }
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
