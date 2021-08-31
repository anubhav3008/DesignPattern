package Factories;

import Models.Animals.Animal;
import Models.Foods.*;

public abstract class HomeFactory {
    public abstract Animal getAnimal();
    public abstract Food getFood();
}
