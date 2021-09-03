package Service;

import States.*;

public class CeilingFanService {
    private State currentState;
    public CeilingFanService(){
        this.currentState = new OffState();
    }

    public void setState(State s){
        this.currentState =s;
    }
    public void pull(){
        this.currentState.pull(this);
        System.out.println("current state = "+currentState);
    }
    
}
