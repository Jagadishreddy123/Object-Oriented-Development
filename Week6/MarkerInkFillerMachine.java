public class MarkerInkFillerMachine {
    
    private State emptyMarkerState;
    private State inkFillerState;
    private State permanentInkFillerState;
    private State temporaryInkFillerState;
    private State packageState;
    private State deliveryState;

    State currentState;

    public MarkerInkFillerMachine(){
        emptyMarkerState = new EmptyMarker(this);
        inkFillerState = new InkFiller(this);
        permanentInkFillerState = new PermanentInkFiller(this);
        temporaryInkFillerState = new TemporaryInkFiller(this);
        packageState = new Package(this);
        deliveryState = new Delivery(this);

        currentState = emptyMarkerState;
    }

    public void fillInk() {
        currentState.fillInk();
    }

    public void fillPermanentInk() {
        currentState.fillPermanentInk();
    }

    public void fillTemporaryInk() {
        currentState.fillTemporaryInk();
    }

    public void packMarker() {
        currentState.packMarker();
    }

    public void deliverMarker() {
        currentState.deliverMarker();
    }

    public void deliverySucessfull(){
        currentState.deliverySucessfull();
    }

    public void deliveryFailed() {
        currentState.deliveryFailed();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public State getState(){
        return currentState;
    }

    public State getEmptyMarkerState(){
        return emptyMarkerState;
    }

    public State getInkFillerState(){
        return inkFillerState;
    }

    public State getPermanentInkFillerState(){
        return permanentInkFillerState;
    }

    public State getTemporaryInkFillerState(){
        return temporaryInkFillerState;
    }

    public State getPackageState(){
        return packageState;
    }

    public State getDeliveryState(){
        DeliveryDirector deliveryDirector = new DeliveryDirector();
        DeliveryAgentBuilder builder = new LewsiDeliveryAgent();
        DeliveryAgent agent = deliveryDirector.createAgent(builder);
        return deliveryState;
    }

}