public abstract class Actor implements ActorBehaviour {
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isPayOrder;



    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();


}

