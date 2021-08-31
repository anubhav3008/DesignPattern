import Builder.HouseBuilder;
import Model.House;

public class App {
    public static void main(String[] args) throws Exception {
        House house =  new HouseBuilder().withDoor(2).withRooms(3).build();
        System.out.println(house.doors);
        System.out.println(house.rooms);
    }
}
