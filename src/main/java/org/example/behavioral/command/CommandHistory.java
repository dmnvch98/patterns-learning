package org.example.behavioral.command;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> commandHistory = new Stack<>();

    public Command pop() {
        return commandHistory.pop();
    }

    public void push(Command command) {
        commandHistory.push(command);
    }

    public boolean isEmpty() {
        return commandHistory.isEmpty();
    }
}
