package Proxy;

import java.util.HashMap;
import java.util.Map;

import ThirdPartyLibrary.YoutubeLib;

public class Youtubeproxy {

    private YoutubeLib youtubeLib;
    private Map<String, String> cache =  new HashMap<>();

    public Youtubeproxy(YoutubeLib youtubeLib){
        this.youtubeLib =  youtubeLib;
    }
    

    public String getYoutubeVideo(String id){
        if(cache.containsKey(id)){
            return cache.get(id);
        }
        else{
            var val  =  youtubeLib.getVideo(id);
            cache.put(id, val);
            return val;
        }
    }
}
