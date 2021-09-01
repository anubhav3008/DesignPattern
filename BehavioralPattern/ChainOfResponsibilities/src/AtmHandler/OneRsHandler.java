package AtmHandler;

public class OneRsHandler extends CurrencyHandler {

    @Override
    protected int getCurrencyPerNode() {
        return 1;
    }

    @Override
    protected boolean isSmallestCurrency() {
        return true;
    }
}
