package AtmHandler;

public class FiveRsHandler extends CurrencyHandler {

    public FiveRsHandler(CurrencyHandler currencyHandler) {
        super(currencyHandler);
    }

    @Override
    protected int getCurrencyPerNode() {
        return 5;
    }

    @Override
    protected boolean isSmallestCurrency() {
        return false;
    }
    
}
