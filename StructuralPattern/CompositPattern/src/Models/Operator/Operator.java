package Models.Operator;

import Models.Expression;

public abstract class Operator extends Expression {

    protected Expression expression1;
    protected Expression expression2;

    public Operator(Expression expression1,Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
