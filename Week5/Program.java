public class Program {
    public static void main(String[] args) {
        Context markerContext = new Context(new TemporaryInk());
        markerContext.getInk();
        markerContext.getInk();
        markerContext.setState(new PermanentInk());
        markerContext.getInk();
        markerContext.getInk();
    }
}