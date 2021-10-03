

public class HasInkState implements State {
    InkMachine inkMachine;
    public HasInkState(InkMachine inkMachine) {
        this.inkMachine = inkMachine;
	}

	@Override
    public void startMachine() {
        System.out.println("Machine has already been started.");
    }

    @Override
    public void hasNoInk() {
        System.out.println("Already Verified.");

    }

    @Override
    public void fillInk() {
        System.out.println("Marker has been filled with Ink.");
        inkMachine.setState(inkMachine.getDoneState());
    }

    @Override
    public void inkFilled() {
        System.out.println("Machine has to fill ink first.");
    }

}
