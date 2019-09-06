package carde;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CarServices {
    private final Logger log = LoggerFactory.getLogger(CarServices.class);

    void process(String input) {
        if (log.isDebugEnabled()) {
            log.debug("processing car:{}" + input);
        }
    }
}
