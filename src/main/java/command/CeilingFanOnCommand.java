package command;

import stuff.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.low();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
