public class MarkerDeselectCommand implements Command{
    private Marker myMarker;
    public MarkerDeselectCommand(Marker marker){
        myMarker = marker;
    }

    @Override
    public void execute() {
        myMarker.deselectMarker();
    }
}