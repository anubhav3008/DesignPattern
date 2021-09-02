package Entities;

import Mediator.Mediator;

public class Employee {
    public void resign(Mediator mediator){
        System.out.println("Employee going to raise resignation to mediator");
        mediator.resign(this);
    }
}
