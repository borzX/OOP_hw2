public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);

    void  setPayOrder(boolean payOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    boolean isPayOrder();

}
