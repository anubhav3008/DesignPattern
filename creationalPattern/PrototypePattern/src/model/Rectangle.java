package model;

public class Rectangle extends Clonable {

    private int x;
    private int y;

    public Rectangle(int x, int y){
        this.x =  x;
        this.y =  y;
    }
    
    public Rectangle(Rectangle rectangle){
        this.x =  rectangle.x;
        this.y =  rectangle.y;
    }

    @Override
    public Clonable clone() {
        return new Rectangle(this);
    }
}
