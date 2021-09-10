package concreteclass;
import abstractclass.*;
public class PermanentMarkerFactory implements AbstractFactory {

    @Override
    public AbstractMarker createMarker() {
        return new PermanentMarker();
    }

    @Override
    public AbstractColor createColor() {
        return new PermanentColor();
    }
    
}