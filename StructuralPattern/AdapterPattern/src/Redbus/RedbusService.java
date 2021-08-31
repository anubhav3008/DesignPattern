package Redbus;

import java.util.Arrays;
import java.util.List;

public class RedbusService implements IRedbusService {

    @Override
    public List<String> getBuses(String src, String dest, String date) {
       return Arrays.asList("bus1", "bus2");
    }
    
}
