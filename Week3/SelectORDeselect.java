public class SelectORDeselect {
    public Command select, deselect;
    public SelectORDeselect( Command selectCommand, Command deselectCommand) {
        select = selectCommand;
        deselect = deselectCommand;
    }
    void select() { 
        select.execute(); 
    }
    void deselect() {
        deselect.execute();
    }
}
