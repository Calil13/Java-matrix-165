package lesson22.Task;

public enum OrderStatus {
    CREATED, IN_PROGRESS, COMPLETED, CANCELLED;

    public boolean canBeChangedTo(OrderStatus nextStatus){
        switch (this){
            case CREATED:
                return nextStatus == IN_PROGRESS;
            case IN_PROGRESS:
                return nextStatus == COMPLETED || nextStatus == CANCELLED;
            case COMPLETED:
                return nextStatus == CANCELLED;
            default:
                return false;
        }
    }
}
