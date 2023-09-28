package org.example.behavioral.command;

public class LightOffCommand implements Command {
    private final Light light;
    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
