import Factories.*;

public class App {
    public static void main(String[] args) throws Exception {
        AnimalFactory randomAnimalFactory =  new RandomAnimalFactory();
        System.out.println(randomAnimalFactory.getAnimal());
        System.out.println(randomAnimalFactory.getAnimal());

        AnimalFactory balanceAnimalFactory =  new BalanceAnimalFactory();
        System.out.println(balanceAnimalFactory.getAnimal());
        System.out.println(balanceAnimalFactory.getAnimal());

    }
}
