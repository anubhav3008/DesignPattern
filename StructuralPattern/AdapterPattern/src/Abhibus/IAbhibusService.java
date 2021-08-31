package Abhibus;

import java.util.List;

public interface IAbhibusService {

    // source city in full
    // destination city in full

    public List<char[]> getBusesBetweenDesitinations(String sourceCity, String desitinationCity, String date);
    
}
