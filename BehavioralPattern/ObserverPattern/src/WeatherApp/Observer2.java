package WeatherApp;

public class Observer2 implements Observer {

    @Override
    public void onUpdate() {
        System.out.println("got the update on observer 2");
    }
}
