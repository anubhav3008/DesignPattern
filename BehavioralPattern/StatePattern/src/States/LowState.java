package States;

import Service.CeilingFanService;

public class LowState implements State {

    @Override
    public void pull(CeilingFanService ceilingFanService) {
        ceilingFanService.setState(new HighState());
    }
    
}
