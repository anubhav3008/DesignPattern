package Adapters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Abhibus.AbhibusService;
import Abhibus.IAbhibusService;

public class AbhibusAdapter implements  IBusAdaper {

    private IAbhibusService abhibusService;

    private Map<String, String> codeToNameMap = new HashMap<>();

    public AbhibusAdapter(AbhibusService abhibusService){
        this.abhibusService =  abhibusService;
        this.codeToNameMap.put("DEL", "Delhi");
        this.codeToNameMap.put("MAN", "Manali");
    }
    
    public List<String> getBuses(String src, String dest, String date){

        List<char[]> buses = this.abhibusService.getBusesBetweenDesitinations(this.convertcityCodeTocictyName(src),this.convertcityCodeTocictyName(dest), date);
        return this.convertListOfCharArrayToListOfString(buses);
    }

    private String convertcityCodeTocictyName(String cityCode){
      return this.codeToNameMap.get(cityCode);
    }


    private List<String> convertListOfCharArrayToListOfString(List<char[]> buses){
        List<String> ans =  new ArrayList<>(buses.size());
        for (char[] bus : buses) {
            ans.add(new String(bus));
        }
        return ans;
    }
}
