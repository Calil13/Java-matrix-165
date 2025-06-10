package lesson22.Task;

public class AplicationMain {
    public static void main(String[] args) {
        Order order = new Order(500);

        System.out.println("Status : " + order.getOrderStatus());

        order.changeStatusOfOrder(OrderStatus.IN_PROGRESS);
        order.changeStatusOfOrder(OrderStatus.COMPLETED);
        order.changeStatusOfOrder(OrderStatus.CANCELLED);
        order.changeStatusOfOrder(OrderStatus.COMPLETED);
    }
}
