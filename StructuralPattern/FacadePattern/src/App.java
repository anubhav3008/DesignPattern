import Facade.Phone;

public class App {
    public static void main(String[] args) throws Exception {
       Phone phone = new Phone();

       phone.call();
       phone.setRingTone();
    }
}
