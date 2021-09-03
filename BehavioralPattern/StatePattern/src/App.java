import Service.CeilingFanService;

public class App {
    public static void main(String[] args) throws Exception {
        CeilingFanService ceilingFanService =  new CeilingFanService();
        ceilingFanService.pull();
        ceilingFanService.pull();
        ceilingFanService.pull();
        ceilingFanService.pull();
        ceilingFanService.pull();
        ceilingFanService.pull();
    }
}
