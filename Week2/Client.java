import abstractclass.*;
public class Client {
    private AbstractMarker marker;
    private AbstractColor color;
    public Client(AbstractFactory factory){
        marker = factory.createMarker();
        color = factory.createColor();
    }
    public void run(){
        marker.interact(color);
    }
}