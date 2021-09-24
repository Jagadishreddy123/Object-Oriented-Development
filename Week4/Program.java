public class Program {
    public static void main(String[] args) {
        PermanentMarkers permanentMarkers = new PermanentMarkers();
        TemporaryMarkers temporaryMarkers = new TemporaryMarkers();
        AvailableMarkers availableMarkers = new AvailableMarkers(permanentMarkers, temporaryMarkers);
        availableMarkers.availableMarkers();
    }
}