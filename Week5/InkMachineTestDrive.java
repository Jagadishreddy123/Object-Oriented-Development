public class InkMachineTestDrive {
    public static void main(String[] args) {
        InkMachine inkMachine = new InkMachine();

        inkMachine.startMachine();
        inkMachine.hasNoInk();
        inkMachine.fillInk();
        inkMachine.inkFilled();
        
    }
}