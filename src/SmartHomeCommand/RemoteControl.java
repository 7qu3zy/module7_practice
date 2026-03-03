package SmartHomeCommand;

public class RemoteControl {

    private ICommand lastCommand;

    public void pressButton(ICommand command){

        if(command == null){
            System.out.println("Команда не назначена");
            return;
        }

        command.execute();
        lastCommand = command;
    }

    public void undo(){
        if(lastCommand != null)
            lastCommand.undo();
    }
}