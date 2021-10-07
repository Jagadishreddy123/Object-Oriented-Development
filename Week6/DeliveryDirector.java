public class DeliveryDirector {
    public DeliveryAgent createAgent(DeliveryAgentBuilder builder){
        builder.collectPackage();
        builder.outForDelivery();
        return builder.getDeliveryAgent();
    }
}