import java.util.ArrayList;

public class PermanentMarkers {
    ArrayList markersList;

    public PermanentMarkers(){
        markersList = new ArrayList<>();

        addMarker("Classmate", 10);
        addMarker("Camel", 8.2);

    }

    public void addMarker(String name, double d) {
        Markers marker = new Markers(name, d);
        markersList.add(marker);
    }

    public Iterator createIterator(){
        return new PermanentMarkerIterator(markersList);
    }

}