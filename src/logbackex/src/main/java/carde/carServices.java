package carde;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class carServices {
    private final Logger log = LoggerFactory.getLogger(carServices.class);

    public void process(String input) {
        if (log.isDebugEnabled()) {
            log.debug("processing car:{}" + input);
        }
    }
}
