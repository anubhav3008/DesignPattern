package Bridge;

import Models.Color;
import Models.Shape;

public class Circle extends Shape {
    // instead of creating classes like redCircle and BlueCircle, we have a composition which has all the behaviours of color
    private Color color;

    public Circle(Color color){
        this.color =  color;
    }
    
    public void draw(){
        System.out.println("draw with "+ this.color.getName());
    }
     
}
