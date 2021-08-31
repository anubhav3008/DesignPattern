package Models.Operator;

import Models.Expression;

public class Devide extends Operator{

    public Devide(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int getValue() {
        return this.expression1.getValue() /  this.expression2.getValue();
    }
    
}
