import model.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle =  new Rectangle(1, 2);
        System.out.println(rectangle);
        System.out.println(rectangle.clone());
    }
}
