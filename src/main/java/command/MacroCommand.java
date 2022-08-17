package command;

import java.util.Arrays;
import java.util.List;

public class MacroCommand implements Command{
    List<Command> commands;

    public MacroCommand(Command... commands){
        this.commands = Arrays.asList(commands);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.forEach(Command::undo);
    }
}
