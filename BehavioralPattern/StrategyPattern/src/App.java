import Strategies.*;

public class App {
    public static void main(String[] args) throws Exception {
       Strategy strategy1 = new Strategy1();
       strategy1.execute();

       Strategy strategy2 = new Strategy2();
       strategy2.execute();
    }
}
