package Comportamentais.Command.models;

import Comportamentais.Command.Command;

public class Button {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void press(){
        command.execute();
    }
}
