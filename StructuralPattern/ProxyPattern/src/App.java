import Proxy.Youtubeproxy;
import ThirdPartyLibrary.YoutubeLib;

public class App {
    public static void main(String[] args) throws Exception {
        Youtubeproxy youtubeproxy =  new Youtubeproxy(new YoutubeLib());
        System.out.println(youtubeproxy.getYoutubeVideo("1"));
        System.out.println(youtubeproxy.getYoutubeVideo("1"));
    }
}
