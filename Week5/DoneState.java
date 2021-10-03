

public class DoneState implements State {
    InkMachine inkMachine;
    public DoneState(InkMachine inkMachine) {
        this.inkMachine = inkMachine;
	}

	@Override
    public void startMachine() {
        System.out.println("Machine has been already Started.");

    }

    @Override
    public void hasNoInk() {
        System.out.println("Marker has ink.");
    }

    @Override
    public void fillInk() {
        System.out.println("Machine already filled ink in the marker.");
    }

    @Override
    public void inkFilled() {
        System.out.println("Ink Filled in the marker.");
    }
}
