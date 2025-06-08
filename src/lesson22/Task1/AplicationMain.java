package lesson22.Task1;

public class AplicationMain {
    public static void main(String[] args) {
        Order order = new Order(500);

        System.out.println("Status : " + order.getOrderStatus());

        order.changeStatusOfOrder(OrderStatus.IN_PROGRESS);
        order.changeStatusOfOrder(OrderStatus.COMPLETED);
    }
}
