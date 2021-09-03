package WeatherApp;

public class Observer1  implements Observer{

    @Override
    public void onUpdate() {
       System.out.println("got the update on observer 1");
    }
    
}
