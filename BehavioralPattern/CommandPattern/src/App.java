import Commands.*;
import Editor.*;

public class App {
    public static void main(String[] args) throws Exception {
        Editor editor =  new Editor();

        editor.clipBoard =  "anubhav";
        editor.executeCommand(new PasteCommand(editor));
        System.out.println(editor.text);

        editor.clipBoard =  " shrivastava";
        editor.executeCommand(new PasteCommand(editor));
        System.out.println(editor.text);

        editor.undo();
        System.out.println(editor.text);

        editor.undo();
        System.out.println(editor.text);

        editor.clipBoard =  "india";
        editor.executeCommand(new PasteCommand(editor));
        System.out.println(editor.text);
    }
}
