import Factory.ElephantFactory;
import Model.Elephant;

public class App {
    public static void main(String[] args) throws Exception {
        var elephants = ElephantFactory.getElephants();

        for (Elephant elephant : elephants) {
            System.out.println(elephant.id + " "+elephant.elephantType.race);
        }
    }
}
