package Comportamentais.Command.commands;

import Comportamentais.Command.Command;
import Comportamentais.Command.models.Editor;

public class CopyCommands implements Command{

    private Editor editor;

    public CopyCommands(Editor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
      editor.copy();
    }
    
}
