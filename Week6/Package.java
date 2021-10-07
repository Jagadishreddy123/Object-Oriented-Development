public class Package implements State{
    
    MarkerInkFillerMachine markerInkFillerMachine;

    public Package(MarkerInkFillerMachine markerInkFillerMachine){
        this.markerInkFillerMachine = markerInkFillerMachine;
    }

    @Override
    public void fillInk() {
        System.out.println("Already Ink Filled.");
    }

    @Override
    public void fillPermanentInk() {
        System.out.println("Invalid already marker has been filled with Ink.");
    }

    @Override
    public void fillTemporaryInk() {
        System.out.println("Invalid already marker has been filled with Ink.");
    }

    @Override
    public void packMarker() {
        System.out.println("Marker already in packaging.");
    }

    @Override
    public void deliverMarker() {
        System.out.println("Marker Packed");
        markerInkFillerMachine.setState(markerInkFillerMachine.getDeliveryState());
    }

    @Override
    public void deliverySucessfull() {
        System.out.println("Marker still in Packaging");
    }

    @Override
    public void deliveryFailed() {
        System.out.println("Marker still in packing state.");
    }
}