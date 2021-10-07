public class EmptyMarker implements State{

    MarkerInkFillerMachine markerInkFillerMachine;

    public EmptyMarker(MarkerInkFillerMachine markerInkFillerMachine){
        this.markerInkFillerMachine = markerInkFillerMachine;
    }

    @Override
    public void fillInk() {
        System.out.println("Which type of ink you want to fill: 1) Permanent Ink \n 2) Temporary Ink\n");
        markerInkFillerMachine.setState(markerInkFillerMachine.getInkFillerState());
    }

    @Override
    public void fillPermanentInk() {
        System.out.println("Invalid Input");
    }

    @Override
    public void fillTemporaryInk() {
        System.out.println("Invalid Input");
    }

    @Override
    public void packMarker() {
        System.out.println("First you need to fill ink.");
    }

    @Override
    public void deliverMarker() {
        System.out.println("First you need to fill ink.");
    }
    
    @Override
    public void deliverySucessfull() {
        System.out.println("First you need to fill ink.");
    }

    @Override
    public void deliveryFailed() {
        System.out.println("Marker not yet filled with ink.");
    }
}