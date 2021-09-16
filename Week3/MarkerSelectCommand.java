public class MarkerSelectCommand implements Command{
    private Marker myMarker;
    public MarkerSelectCommand(Marker marker){
        myMarker = marker;
    }

    @Override
    public void execute() {
        myMarker.selectMarker();
    }
    
}