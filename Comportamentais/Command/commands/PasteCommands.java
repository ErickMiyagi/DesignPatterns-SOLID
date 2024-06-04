package Comportamentais.Command.commands;

import Comportamentais.Command.Command;
import Comportamentais.Command.models.Editor;

public class PasteCommands implements Command{

    private Editor editor;

    public PasteCommands(Editor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.paste();
    }
    
}
