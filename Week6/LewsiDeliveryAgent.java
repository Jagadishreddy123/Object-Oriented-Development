public class LewsiDeliveryAgent extends DeliveryAgentBuilder{

    @Override
    public void collectPackage() {
        System.out.println("Package Collected.");

    }

    @Override
    public void outForDelivery() {
        System.out.println("Out for Delivery");

    }

    @Override
    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }
    
}