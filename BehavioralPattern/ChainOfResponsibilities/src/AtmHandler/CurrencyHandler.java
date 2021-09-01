package AtmHandler;

public abstract class CurrencyHandler {

    private CurrencyHandler nextCurrencyHandler;
    public CurrencyHandler(CurrencyHandler currencyHandler){
        this.nextCurrencyHandler =  currencyHandler;
    }
    public CurrencyHandler(){

    }

    protected abstract int getCurrencyPerNode();
    protected abstract boolean isSmallestCurrency();

    public void withdrawMoney(int amount){
        if(this.canHandle(amount)){
            System.out.println("number of notes of "+this.getCurrencyPerNode() +" is \t" + amount/this.getCurrencyPerNode());
            if(!this.isSmallestCurrency()){
                this.nextCurrencyHandler.withdrawMoney(amount%this.getCurrencyPerNode());
            }
        }
        else if(!this.isSmallestCurrency()){
                this.nextCurrencyHandler.withdrawMoney(amount);
            }
    }
    private boolean canHandle(int amount){
        if(this.getCurrencyPerNode()<=amount){
            return true;
        }
        return false;
    }
}
