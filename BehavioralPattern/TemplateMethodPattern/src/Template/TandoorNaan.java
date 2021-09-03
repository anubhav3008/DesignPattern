package Template;

public class TandoorNaan  extends BreadTemplate{

    @Override
    protected void useStartIngredients() {
        System.out.println("maida, water, yeast, baking poweder, baking soda, salt, suger(very less), grated garlic");
        
    }

    @Override
    protected void cook() {
        System.out.println("use tandoor or wired rack too cook");
        
    }

    @Override
    protected void useEndIngredients() {
        System.out.println("brush generous amount of melted butter");
        
    }
}
