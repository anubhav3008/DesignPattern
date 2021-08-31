package Factories;

import Models.Animals.Animal;
import Models.Animals.Cat;
import Models.Foods.Food;
import Models.Foods.Milk;

public class CatHomeFactory extends HomeFactory {

    @Override
    public Animal getAnimal() {
       return new Cat();
    }

    @Override
    public Food getFood() {
        return new Milk();
    }
}
