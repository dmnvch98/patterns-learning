package org.example.behavioral.command;

public class RemoteController {
    Command command;
    CommandHistory commandHistory;

    public RemoteController() {
        commandHistory = new CommandHistory();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }
}
