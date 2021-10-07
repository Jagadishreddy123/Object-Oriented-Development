public class InkFiller implements State{

    MarkerInkFillerMachine markerInkFillerMachine;

    public InkFiller(MarkerInkFillerMachine markerInkFillerMachine){
        this.markerInkFillerMachine = markerInkFillerMachine;
    }

    @Override
    public void fillInk() {
        System.out.println("Select type of ink you want to fill: 1) Permanent Ink \n 2) Temporary Ink\n");
    }

    @Override
    public void fillPermanentInk() {
        System.out.println("Permanent Ink Filled");
        markerInkFillerMachine.setState(markerInkFillerMachine.getPermanentInkFillerState());
    }

    @Override
    public void fillTemporaryInk() {
        System.out.println("Temporary Ink Filled");
        markerInkFillerMachine.setState(markerInkFillerMachine.getTemporaryInkFillerState());
    }

    @Override
    public void packMarker() {
        System.out.println("First you need to select type of ink you want to fill.");
    }

    @Override
    public void deliverMarker() {
        System.out.println("First you need to select type of ink you want to fill.");
    }

    @Override
    public void deliverySucessfull() {
        System.out.println("Select which type of ink you need to fill.");
    }

    @Override
    public void deliveryFailed() {
        System.out.println("Marker is not yet filled with ink, please select type of ink you want to fill.");
    }
    
}