package command;

import stuff.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    CeilingFan.FanSpeed prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getFanSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.FanSpeed.HIGH) {
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.FanSpeed.MEDIUM) {
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.FanSpeed.LOW) {
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.FanSpeed.OFF) {
            ceilingFan.off();
        }
    }
}
