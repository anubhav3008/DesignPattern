package Builder;

import Model.House;

public class HouseBuilder extends Builder {

    private House house;
    public HouseBuilder(){
        this.house = new House();
    }

    @Override
    public Builder withDoor(int count) {
        this.house.doors =  count;
        return this;
    }

    @Override
    public Builder withRooms(int count) {
        this.house.rooms = count;
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }    
}
