public abstract class DeliveryAgentBuilder {
    protected DeliveryAgent deliveryAgent = new DeliveryAgent();

    public abstract void collectPackage();
    public abstract void outForDelivery();
    public abstract DeliveryAgent getDeliveryAgent(); 

}