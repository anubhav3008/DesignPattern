import Factories.CatHomeFactory;
import Factories.CowHomeFactory;
import Factories.HomeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        HomeFactory cowHomeFactory =  new CowHomeFactory();
        System.out.println(cowHomeFactory.getAnimal());
        System.out.println(cowHomeFactory.getFood());


        HomeFactory catHomeFactory = new CatHomeFactory();
        System.out.println(catHomeFactory.getAnimal());
        System.out.println(catHomeFactory.getFood());

    }
}
