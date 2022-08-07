import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        while(true) {
            logger.fatal("Fatal Message");
            logger.error("Error Message");
            logger.warn("Warning message");
            logger.info("INFO message");
            logger.debug("Debug Message");
            logger.trace("Trace Message");
        }
    }

}
