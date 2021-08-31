package Factories;

import Models.Animals.*;
import Models.Foods.Food;
import Models.Foods.Grass;

public class CowHomeFactory extends HomeFactory {

    @Override
    public Animal getAnimal() {
        return new Cow();
    }

    @Override
    public Food getFood() {
        return new Grass();
    }    
}
