package com.reports;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.utils.TestUtils;

public class LogStatus {

	private LogStatus() {
		// private to avoid initialization
	}
	
	private static Logger log=(Logger) LogManager.getLogger();

	public static void pass(String message) {

		log.info(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.PASS, message);

	}

	public static void fail(String message) {
		log.fatal(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, message);
	}

	public static void fail(Exception message) {
		log.fatal(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, message);
	}

	public static void fail(AssertionError a) {

		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, a);
	}

	public static void info(String message) {

		log.info(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.INFO, message);
	}

	public static void error(String message) {
		log.fatal(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.ERROR, message);
	}

	public static void fatal(String message) {

		log.fatal(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FATAL, message);
	}

	public static void skip(String message) {
		log.info(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.SKIP, message);
	}

	public static void unknown(String message) {

		log.info(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.UNKNOWN, message);
	}

	public static void warning(String message) {
		log.warn(message);
		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.WARNING, message);
	}

	public static void pass(String string, String addScreenCapture) {

		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.PASS, string,
				ExtentManager.getExtTest()
						.addBase64ScreenShot("data:image/png;base64," + TestUtils.getBase64Image(addScreenCapture)));

	}

	public static void fail(String string, String addScreenCapture) {

		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, string,
				ExtentManager.getExtTest()
						.addBase64ScreenShot("data:image/png;base64," + TestUtils.getBase64Image(addScreenCapture)));
	}

	public static void skip(String string, String addScreenCapture) {

		ExtentManager.getExtTest().log(com.relevantcodes.extentreports.LogStatus.SKIP, string,
				ExtentManager.getExtTest()
						.addBase64ScreenShot("data:image/png;base64," + TestUtils.getBase64Image(addScreenCapture)));
	}
}
