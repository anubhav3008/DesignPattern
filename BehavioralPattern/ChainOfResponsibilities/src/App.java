
import AtmHandler.*;

public class App {
    public static void main(String[] args) throws Exception {
       CurrencyHandler currencyHandler =  new TenRsHandler(new FiveRsHandler(new TwoRsHandler(new OneRsHandler())));
       currencyHandler.withdrawMoney(28);
    }
}
