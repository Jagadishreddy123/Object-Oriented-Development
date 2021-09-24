import java.util.ArrayList;

import jdk.nashorn.internal.ir.Flags;

public class TemporaryMarkerIterator implements Iterator{
    ArrayList markers;
    int position = 0;

    public TemporaryMarkerIterator(ArrayList markersList){
        this.markers = markersList;
    }

    @Override
    public boolean hasNext() {
        if(position >= markers.size() || markers.get(position) == null){
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next() {
        Markers marker = (Markers) markers.get(position);
        position = position + 1;
        return marker;
    }
    
}