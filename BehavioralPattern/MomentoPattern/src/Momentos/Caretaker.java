package Momentos;
import java.util.*;

public class Caretaker {
    private ArrayList<Momento> mementos = new ArrayList<>();

    public void addMemento(Momento m) {
        mementos.add(m);
    }

    public Momento getMemento(){
        return this.mementos.get(0);
    }
}
