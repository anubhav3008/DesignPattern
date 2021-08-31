package Models.Operand;

import Models.Expression;

public class Operand extends Expression {
    private int value;
    public Operand(int value){
        this.value =  value;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
