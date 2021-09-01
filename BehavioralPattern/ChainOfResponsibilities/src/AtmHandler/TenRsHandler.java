package AtmHandler;

public class TenRsHandler extends CurrencyHandler {

    public TenRsHandler(CurrencyHandler currencyHandler) {
        super(currencyHandler);
    }

    @Override
    protected int getCurrencyPerNode() {
        return 10;
    }

    @Override
    protected boolean isSmallestCurrency() {
        return false;
    }
}
