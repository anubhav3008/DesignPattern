package Factory;

import java.util.ArrayList;
import java.util.List;

import Model.Elephant;
import Model.ElephantType;

public class ElephantFactory {
    private static List<Elephant> elephants =  new ArrayList<>();
    public static List<Elephant> getElephants(){
        if(elephants.isEmpty()){
            // this is flyweight pattern that instead of creating a new object, we use the same object, hence saving memory
            ElephantType aftrican =  new ElephantType();
            aftrican.race = "aftrican";

            ElephantType asian =  new ElephantType();
            asian.race = "asian";
            

            for(int i=0;i<100;i++){
                Elephant elephant =  new Elephant();
                elephant.id = i;
                elephant.elephantType = i%2 ==0? asian :  aftrican;
                elephants.add(elephant);
            }
        }
        return elephants;
    }
    
}
