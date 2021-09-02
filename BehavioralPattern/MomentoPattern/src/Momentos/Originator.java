package Momentos;

public class Originator {
    private String state;

    public void setState(String state){
        System.out.println("going to set state as "+state);
    }

    public Momento save(){
        System.out.println("saving to momento");
        return new Momento(this.state);
    }

    public void restore(Momento m){
        this.state  =  m.getState();
        System.out.println("restoring to state = "+ m.getState());
    }
    
}
