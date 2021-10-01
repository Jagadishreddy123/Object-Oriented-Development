public class Context {
    private State inkState;
    public Context(State state){
        inkState = state;
    }
    
    public void setState(State state){
        inkState = state;
    }

    public void getInk(){
        inkState.insertInk(this);
    }

}