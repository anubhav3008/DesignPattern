package Mediator;
import Entities.*;
public class Mediator {
    private Hr hr;
    private Accountant accountant;
    public Mediator(Hr hr, Accountant accountant){
        this.hr =  hr;
        this.accountant =  accountant;
    }

    public void resign(Employee employee){
        System.out.println("mediator raising the resignation request to hr and accountant");
        this.hr.resign(employee);
        this.accountant.settlePay(employee);
    }
}
