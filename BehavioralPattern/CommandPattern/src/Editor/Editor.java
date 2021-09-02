package Editor;

import java.util.Stack;

import Commands.Command;

public class Editor {
    public String text = "";
    public Stack<Command> commandHistory =  new Stack<>(); 
    public String clipBoard= "";
    
    public void executeCommand(Command command){
        commandHistory.push(command);
        command.executeCommand();
    }

    public void undo(){
        if(commandHistory.isEmpty()){
            return;
        }
        commandHistory.pop().undo();
    }
}
