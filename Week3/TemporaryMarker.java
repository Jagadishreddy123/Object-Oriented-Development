public class TemporaryMarker implements Marker{
    @Override
    public void selectMarker() {
        System.out.println("Selected Temporary Marker.");
    }
    @Override
    public void deselectMarker() {
        System.out.println("Deselected Temporary Marker.");
    }
}
