package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo3 {

	private static Logger log = LogManager.getLogger(Demo3.class.getName());

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 100000; i++) {
			Thread.sleep(1);
			log.debug(i+" I am debugging");

			log.info(i+" Object is present");

			log.error(i+" object is not present");

			log.fatal(i+" This is fatal.");
		}

	}

}
