package SmartHomeCommand;

import java.util.List;

public class MacroCommand implements ICommand {

    private List<ICommand> commands;

    public MacroCommand(List<ICommand> commands){
        this.commands = commands;
    }

    public void execute(){
        for(ICommand c : commands)
            c.execute();
    }

    public void undo(){
        for(ICommand c : commands)
            c.undo();
    }
}