package Redbus;

import java.util.List;

public interface IRedbusService {
    // src : source city code  
    // dest: destination city code
    // date : date in format yyyy-MM-dd
    List<String> getBuses(String src, String dest, String date);
}
