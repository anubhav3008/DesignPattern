import Bridge.Circle;
import Models.BlueColor;
import Models.RedColor;
import Models.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape bluShape =  new Circle(new BlueColor());
        bluShape.draw();


        Shape redShape = new Circle(new RedColor());
        redShape.draw();
    }
}
