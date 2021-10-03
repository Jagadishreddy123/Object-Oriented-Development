

public class NoInkState implements State {
    InkMachine inkMachine;
    public NoInkState(InkMachine inkMachine) {
        this.inkMachine = inkMachine;
	}

	@Override
    public void startMachine() {
        System.out.println("Already machine has been started");
    }

    @Override
    public void hasNoInk() {
        System.out.println("Verified marker doesn't contain any ink.");
        inkMachine.setState(inkMachine.getHasInkState());
    }

    @Override
    public void fillInk() {
        // TODO Auto-generated method stub

    }

    @Override
    public void inkFilled() {
        // TODO Auto-generated method stub

    }

}
