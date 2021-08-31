package Factories;
import models.*;

public class BalanceAnimalFactory extends AnimalFactory{

    private int numberOfCats = 0;
    private int numberOfCows = 0;
    @Override
    public Animal getAnimal() {
       if(numberOfCats < numberOfCows){
            numberOfCats ++;
            return new Cat();
       }
       else{
           numberOfCows++;
           return new Cow();
       }
    }    
}
