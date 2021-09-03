import Template.BreadTemplate;
import Template.Chapati;
import Template.TandoorNaan;

public class App {
    public static void main(String[] args) throws Exception {
        BreadTemplate naan =  new TandoorNaan();
        BreadTemplate chapati =  new Chapati();
        naan.prepare();
        chapati.prepare();
    }
}
