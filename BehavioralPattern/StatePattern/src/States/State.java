package States;

import Service.CeilingFanService;

public interface State { 
    void pull(CeilingFanService ceilingFanService);
}
