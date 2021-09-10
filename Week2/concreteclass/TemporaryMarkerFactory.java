package concreteclass;
import abstractclass.*;
public class TemporaryMarkerFactory implements AbstractFactory {

    @Override
    public AbstractMarker createMarker() {
        return new TemporaryMarker();
    }

    @Override
    public AbstractColor createColor() {
        return new TemporaryColor();
    }
    
}