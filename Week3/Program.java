public class Program {
    public static void main(String[] args) {
        Marker permanentMarker = new PermanentMarker();
        Marker temporaryMarker = new TemporaryMarker();

        MarkerSelectCommand permanentMarkerSelectCommand = new MarkerSelectCommand(permanentMarker);
        MarkerSelectCommand temporaryMarkerSelectCommand = new MarkerSelectCommand(temporaryMarker);

        MarkerDeselectCommand permanentMarkerDeselectCommand = new MarkerDeselectCommand(permanentMarker);
        MarkerDeselectCommand temporaryMarkerDeselectCommand = new MarkerDeselectCommand(temporaryMarker);

        SelectORDeselect permanentSelectORDeselect = new SelectORDeselect(permanentMarkerSelectCommand, permanentMarkerDeselectCommand);
        permanentSelectORDeselect.select();
        permanentSelectORDeselect.deselect();

        SelectORDeselect temporarySelectORDeselect = new SelectORDeselect(temporaryMarkerSelectCommand, temporaryMarkerDeselectCommand);
        temporarySelectORDeselect.select();
        temporarySelectORDeselect.deselect();
    }
}