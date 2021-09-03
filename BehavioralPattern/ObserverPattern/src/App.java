import WeatherApp.Observable;
import WeatherApp.Observer;
import WeatherApp.Observer1;
import WeatherApp.Observer2;

public class App {
    public static void main(String[] args) throws Exception {       
       Observer observer1 = new Observer1();
       Observer observer2 =  new Observer2();

       Observable observable =  new Observable();
       observable.register(observer1);
       observable.register(observer2);


       observable.notifyChange();

       observable.deregsiter(observer1);

       observable.notifyChange();

    }
}
