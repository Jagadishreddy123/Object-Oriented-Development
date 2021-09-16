public class PermanentMarker implements Marker{
    @Override
    public void selectMarker() {
        System.out.println("Selected Permanent Marker.");
    }

    @Override
    public void deselectMarker() {
        System.out.println("Deselected Permanent Marker.");
    }
}
