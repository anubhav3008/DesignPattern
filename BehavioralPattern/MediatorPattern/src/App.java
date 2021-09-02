import Entities.Accountant;
import Entities.Employee;
import Entities.Hr;
import Mediator.Mediator;

public class App {
    public static void main(String[] args) throws Exception {
        Mediator mediator =  new Mediator(new Hr(), new Accountant());
        Employee employee =  new Employee();
        employee.resign(mediator);
    }
}
