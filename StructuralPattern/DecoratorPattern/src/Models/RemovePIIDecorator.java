package Models;
import java.util.*;
import java.util.regex.*;

public class RemovePIIDecorator extends LoggerDecorator{

    private final String[] TARGETS = {
        "\\d{3}-\\d{2}-\\d{4}",                 // aadhar number
        "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}",  // email
        "(0/91)?[7-9][0-9]{9}"             // phone
    };
    private final String MASK = "###";

    private ArrayList<Pattern> patterns;

    public RemovePIIDecorator(Logger logger) {
        super(logger);
        patterns = new ArrayList<Pattern>();
        for(String s : TARGETS) {
            patterns.add(Pattern.compile(s));
        }
    }

    @Override
    public void log(String data) {
        this.logger.log(this.maskPII(data));
    }


    public String maskPII(String s) {
        for(Pattern p : patterns) {
            s = p.matcher(s).replaceAll(MASK);
        }
        return s;
    }
}
