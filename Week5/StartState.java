

public class StartState implements State {

    InkMachine inkMachine;

    public StartState(InkMachine inkMachine) {
        this.inkMachine = inkMachine;
	}

	@Override
    public void startMachine() {
        System.out.println("You Started the Machine");
        inkMachine.setState(inkMachine.getNoInkState());
    }

    @Override
    public void hasNoInk() {
        System.out.println("You haven't Started the machine");
    }

    @Override
    public void fillInk() {
        System.out.println("You Need to check whether marker has ink or not");
    }

    @Override
    public void inkFilled() {
        System.out.println("You have to fill ink first.");
    }

}
