public interface QueueBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void payOrder();

    void releaseFromQueue();

    void update();
}
