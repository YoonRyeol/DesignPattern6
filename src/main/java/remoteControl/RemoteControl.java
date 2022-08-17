package remoteControl;

import command.Command;
import command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this(7);
    }

    public RemoteControl(int size){
        onCommands = new Command[size];
        offCommands = new Command[size];

        Command noCommand = new NoCommand();
        for(int i=0; i<size; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ 리모컨 ------\n");
        for(int i=0; i< onCommands.length; i++) {
            stringBuffer.append(String.format("[slot %d] %s    %s\n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
        }
        stringBuffer.append(String.format("[undo] %s\n", undoCommand.getClass().getName()));
        return stringBuffer.toString();
    }

}
