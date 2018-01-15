package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {

	private static Logger log = LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {

		log.debug("I am debugging");

		log.info("Object is present");

		log.error("object is not present");

		log.fatal("This is fatal.");
	}

}
