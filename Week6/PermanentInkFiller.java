public class PermanentInkFiller implements State{

    MarkerInkFillerMachine markerInkFillerMachine;

    public PermanentInkFiller(MarkerInkFillerMachine markerInkFillerMachine){
        this.markerInkFillerMachine = markerInkFillerMachine;
    }

    @Override
    public void fillInk() {
        System.out.println("Invalid Input");
    }

    @Override
    public void fillPermanentInk() {
        System.out.println("Already Permanent Ink Filled.");
    }

    @Override
    public void fillTemporaryInk() {
        System.out.println("Invalid already marker has been filled with Temporary Ink");
    }

    @Override
    public void packMarker() {
        System.out.println("Marker moved to Package for packing.");
        markerInkFillerMachine.setState(markerInkFillerMachine.getPackageState());
    }

    @Override
    public void deliverMarker() {
        System.out.println("Marker not yet moved to Package");
    }

    @Override
    public void deliverySucessfull() {
        System.out.println("Filling Permanent Ink.");
    }

    @Override
    public void deliveryFailed() {
        System.out.println("Marker Not yet out for delivery");
    }
    
}