package Commands;

import Editor.Editor;

public abstract class Command {

    protected Editor editor;
    
    private String backup;

    public Command(Editor editor){
        this.editor =  editor;
    }

    public void executeCommand(){
        this.backup = this.editor.text;
        this.execute();

    }
    public abstract void execute();

    public void undo(){
        this.editor.text =  backup;
    }
}
