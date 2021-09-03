package Template;

public class Chapati extends BreadTemplate {

    @Override
    protected void useStartIngredients() {
       System.out.println("wheat flour and water");
        
    }

    @Override
    protected void cook() {
        System.out.println("cook in tawa and then on fire directly");
    }

    @Override
    protected void useEndIngredients() {
        System.out.println("optional to use ghee in the end");
    }
}
