package WeatherApp;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers =  new ArrayList<>();

    public void register(Observer observer){
        System.out.println("going to register");
        this.observers.add(observer);
    }

    public void deregsiter(Observer observer){
        System.out.println("going to de register");
        this.observers.remove(observer);
    }

    public void notifyChange(){
        this.observers.forEach(x -> x.onUpdate());
    }
}
