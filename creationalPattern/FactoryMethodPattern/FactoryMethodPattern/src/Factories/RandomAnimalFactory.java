package Factories;

import java.util.Random;

import models.*;

public class RandomAnimalFactory extends AnimalFactory {

    @Override
    public Animal getAnimal() {
        int random  = new Random().nextInt(2);
        switch (random){
            case 0 : 
            return new Cat();
            default: 
            return new Cow();
        }
    }
}
