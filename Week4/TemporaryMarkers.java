import java.util.ArrayList;

public class TemporaryMarkers {
    ArrayList markersList;

    public TemporaryMarkers(){
        markersList = new ArrayList<>();

        addMarker("Classmate", 6);
        addMarker("Camel", 5.2);

    }

    public void addMarker(String name, double d) {
        Markers marker = new Markers(name, d);
        markersList.add(marker);
    }

    public Iterator createIterator(){
        return new TemporaryMarkerIterator(markersList);
    }

}