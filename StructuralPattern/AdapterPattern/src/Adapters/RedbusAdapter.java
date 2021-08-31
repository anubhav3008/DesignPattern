package Adapters;

import java.util.List;

import Redbus.IRedbusService;

public class RedbusAdapter implements  IBusAdaper{

    private IRedbusService redbusService;

    public RedbusAdapter(IRedbusService redbusService){
        this.redbusService =  redbusService;
    }

    public List<String> getBuses(String src, String dest, String date){
        // convert to common contract
        return redbusService.getBuses(src, dest, date);
    }
    
}
