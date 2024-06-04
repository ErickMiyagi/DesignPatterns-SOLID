package Comportamentais.Command;

import Comportamentais.Command.commands.CopyCommands;
import Comportamentais.Command.commands.PasteCommands;
import Comportamentais.Command.models.Button;
import Comportamentais.Command.models.Editor;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Command copy = new CopyCommands(editor);
        Command paste = new PasteCommands(editor);

        Button copyButton = new Button();
        Button pasteButton = new Button();

        copyButton.setCommand(copy);
        pasteButton.setCommand(paste);

        copyButton.press();
        pasteButton.press();
    }
}
