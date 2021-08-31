package Models;

import java.util.Date;

public class TimeStampDecorator extends LoggerDecorator {
    
    public TimeStampDecorator(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String data) {     
        this.logger.log(new Date() + "\t"+ data);
    }
    
}
