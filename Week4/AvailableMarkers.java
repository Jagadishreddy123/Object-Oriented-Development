import java.util.jar.Attributes.Name;

public class AvailableMarkers {
    PermanentMarkers permanentMarkers;
    TemporaryMarkers temporaryMarkers;

    public AvailableMarkers(PermanentMarkers permanentMarkers, TemporaryMarkers temporaryMarkers){
        this.permanentMarkers = permanentMarkers;
        this.temporaryMarkers = temporaryMarkers;
    }

    public void availableMarkers(){
        Iterator permanentIterator = permanentMarkers.createIterator();
        Iterator temporaryIterator = temporaryMarkers.createIterator();

        System.out.println("Permanent Markers which are available are: \n");
        availableMarkers(permanentIterator);
        System.out.println("Temporary Markers which are available are: \n");
        availableMarkers(temporaryIterator);

    }

    private void availableMarkers(Iterator iterator) {
        while(iterator.hasNext()){
            Markers marker = (Markers) iterator.next();
            System.out.print("Name: " + marker.getMarkerName() + ", ");
            System.out.println("Cost: " + marker.getMarkerCost());
        }
    }
    
}