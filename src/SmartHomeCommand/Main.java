package SmartHomeCommand;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Light light = new Light();
        Tv tv = new Tv();

        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.pressButton(lightOn);
        remote.undo();

        MacroCommand macro = new MacroCommand(
                Arrays.asList(lightOn)
        );

        remote.pressButton(macro);
    }
}