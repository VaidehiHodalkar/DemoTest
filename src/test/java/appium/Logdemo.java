package appium;

import java.io.IOException;

import org.apache.logging.log4j.*;


public class Logdemo {

	private static Logger log=LogManager.getLogger(Logdemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging");
		log.info("object is present");
		log.error("object is not present");
		log.fatal("this is fatal");
	}
}
