public class InkMachine {

    private State startState;
    private State hasInkState;
    private State noInkState;
    private State doneState;

    State state;

    public InkMachine(){
        startState = new StartState(this);
        hasInkState = new HasInkState(this);
        noInkState = new NoInkState(this);
        doneState = new DoneState(this);

        state = startState;
    }

    public void startMachine(){
        state.startMachine();
    }
    public void hasNoInk(){
        state.hasNoInk();
    }
    public void fillInk(){
        state.fillInk();
    }
    public void inkFilled(){
        state.inkFilled();
    }
    
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public State getStartState(){
        return startState;
    }

    public State getNoInkState(){
        return noInkState;
    }

    public State getHasInkState(){
        return hasInkState;
    }

    public State getDoneState(){
        return doneState;
    }
}