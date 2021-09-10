import concreteclass.*;
public class Program {
    public static void main(String... args){
        Client client = null;
        client = new Client(new PermanentMarkerFactory());
        client.run();
        client = new Client(new TemporaryMarkerFactory());
        client.run();
    }
}