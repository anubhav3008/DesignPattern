import Abhibus.AbhibusService;
import Adapters.AbhibusAdapter;
import Adapters.IBusAdaper;
import Adapters.RedbusAdapter;
import Redbus.RedbusService;

public class App {
    public static void main(String[] args) throws Exception {
        IBusAdaper redbusAdapter  = new RedbusAdapter(new RedbusService());
        IBusAdaper abhiBusAdaper = new AbhibusAdapter(new AbhibusService());

        System.out.println(redbusAdapter.getBuses("DEL", "MAN", "2021-10-09"));
        System.out.println(abhiBusAdaper.getBuses("DEL", "MAN", "2021-10-09"));
    }
}
