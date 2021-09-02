package Commands;

import Editor.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        this.editor.text =  this.editor.text +  this.editor.clipBoard;
    }
}
