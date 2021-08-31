package Adapters;
import java.util.List;
public interface IBusAdaper {
    List<String> getBuses(String src, String dest, String date);
}
