package Builder;

import Model.House;

public abstract class Builder {
    public abstract Builder withDoor(int count);
    public abstract Builder withRooms(int count);
    public abstract House build();
}
