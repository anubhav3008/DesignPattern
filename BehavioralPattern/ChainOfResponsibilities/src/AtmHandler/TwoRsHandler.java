package AtmHandler;

public class TwoRsHandler extends CurrencyHandler {


    public TwoRsHandler(CurrencyHandler currencyHandler) {
        super(currencyHandler);
    }

    @Override
    protected int getCurrencyPerNode() {
        return 2;
    }

    @Override
    protected boolean isSmallestCurrency() {
        return false;
    }
}
