public class Delivery implements State{
    MarkerInkFillerMachine markerInkFillerMachine;

    public Delivery(MarkerInkFillerMachine markerInkFillerMachine){
        this.markerInkFillerMachine = markerInkFillerMachine;
    }

    @Override
    public void fillInk() {
        System.out.println("Already Ink Filled and ready to delivered.");
    }

    @Override
    public void fillPermanentInk() {
        System.out.println("Ink Already filled.");
    }

    @Override
    public void fillTemporaryInk() {
        System.out.println("Ink Already filled.");
    }

    @Override
    public void packMarker() {
        System.out.println("Marker already packed.");
    }

    @Override
    public void deliverMarker() {
        System.out.println("Marker Out for delivery");
    }

    @Override
    public void deliverySucessfull() {
        System.out.println("Delivery Success");
    }

    @Override
    public void deliveryFailed() {
        System.out.println("Delivery Failed, please retry for delivery");
        markerInkFillerMachine.setState(markerInkFillerMachine.getPackageState());
    }
}