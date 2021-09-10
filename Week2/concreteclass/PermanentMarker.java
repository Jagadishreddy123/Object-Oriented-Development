package concreteclass;
import abstractclass.AbstractColor;
import abstractclass.AbstractMarker;

public class PermanentMarker extends AbstractMarker{

    @Override
    public void interact(AbstractColor color) {
        System.out.println(this.getClass().getSimpleName() + " interacts with " + color.getClass().getSimpleName());
    }
    
}