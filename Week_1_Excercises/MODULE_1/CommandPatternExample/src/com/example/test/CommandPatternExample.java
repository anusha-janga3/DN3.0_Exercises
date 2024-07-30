// com/example/test/CommandPatternExample.java
package com.example.test;

import com.example.command.Command;
import com.example.command.LightOnCommand;
import com.example.command.LightOffCommand;
import com.example.receiver.Light;
import com.example.invoker.RemoteControl;

public class CommandPatternExample {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
