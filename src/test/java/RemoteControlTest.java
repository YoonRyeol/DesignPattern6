import command.*;
import org.junit.jupiter.api.Test;
import remoteControl.RemoteControl;
import stuff.*;

public class RemoteControlTest {
    @Test
    void test() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("부엌");
        CeilingFan ceilingFan = new CeilingFan("거실");
        GarageDoor garageDoor = new GarageDoor("차고");
        Stereo stereo = new Stereo("거실");

        LightOnCommand livingRoomlightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomlightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomlightOn, livingRoomlightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }

    @Test
    void test2() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");

        LightOnCommand livingRoomlightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomlightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomlightOn, livingRoomlightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    @Test
    void test3() {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("거실");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    @Test
    void test4() {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("거실");
        TV tv = new TV("거실");
        Stereo stereo = new Stereo("거실");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        MacroCommand partyOnMacro = new MacroCommand(lightOn, stereoOnWithCD, tvOn ,hottubOn);
        MacroCommand partyOffMacro = new MacroCommand(lightOff, stereoOff, tvOff, hottubOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- 매크로 ON ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- 매크로 OFF ---");
//        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
