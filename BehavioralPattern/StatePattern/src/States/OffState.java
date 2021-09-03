package States;

import Service.CeilingFanService;

public class OffState implements State {

    @Override
    public void pull(CeilingFanService ceilingFanService) {
        ceilingFanService.setState(new LowState());        
    }
    
}
