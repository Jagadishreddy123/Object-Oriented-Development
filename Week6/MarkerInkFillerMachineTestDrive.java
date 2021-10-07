public class MarkerInkFillerMachineTestDrive {
    public static void main(String[] args) {
        
        MarkerInkFillerMachine markerInkFillerMachine = new MarkerInkFillerMachine();
        
        markerInkFillerMachine.fillPermanentInk();
        markerInkFillerMachine.fillInk();
        markerInkFillerMachine.fillTemporaryInk();
        markerInkFillerMachine.packMarker();
        markerInkFillerMachine.deliverMarker();
        markerInkFillerMachine.deliveryFailed();
        
        markerInkFillerMachine.deliverMarker();
        markerInkFillerMachine.deliverySucessfull();
    }
}