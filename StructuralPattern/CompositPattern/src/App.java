
import Models.Operand.*;
import Models.Operator.*;

public class App {
    public static void main(String[] args) throws Exception {
       var expression = new Devide(new Multiply(new Add(new Operand(1), new Operand(2)), new Substract(new Operand(5), new Operand(1))), new Operand(2));
       System.out.println(expression.getValue());
    }
}
