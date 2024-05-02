package package2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo2 {

	private static Logger log=LogManager.getLogger(package2.LogDemo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging");
		log.info("object is present");
		log.error("object is not present");
		log.fatal("this is fatal");
	}
}
