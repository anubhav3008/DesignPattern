package States;

import Service.CeilingFanService;

public class HighState implements State {

    @Override
    public void pull(CeilingFanService ceilingFanService) {
       ceilingFanService.setState(new OffState());
    }
    
}
