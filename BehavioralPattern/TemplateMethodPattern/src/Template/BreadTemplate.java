package Template;

public abstract class BreadTemplate{

    public void prepare(){
        useStartIngredients();
        cook();
        useEndIngredients();
    }

    protected abstract void useStartIngredients();
    protected abstract void cook();
    protected abstract void useEndIngredients();

}