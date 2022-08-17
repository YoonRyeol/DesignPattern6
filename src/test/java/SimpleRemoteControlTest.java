import command.GarageDoorOpenCommand;
import command.LightOnCommand;
import stuff.GarageDoor;
import stuff.Light;
import org.junit.jupiter.api.Test;
import remoteControl.SimpleRemoteControl;

public class SimpleRemoteControlTest {
    @Test
    void test() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("거실");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("차고");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
