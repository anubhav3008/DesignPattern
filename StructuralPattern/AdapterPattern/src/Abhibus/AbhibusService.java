package Abhibus;

import java.util.Arrays;
import java.util.List;

public class AbhibusService implements IAbhibusService {

    @Override
    public List<char[]> getBusesBetweenDesitinations(String sourceCity, String desitinationCity, String date) {
        return Arrays.asList(new char[]{'b','u','s'});
    }
    
}
