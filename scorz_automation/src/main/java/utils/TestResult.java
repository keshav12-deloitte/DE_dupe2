package utils;

import java.util.logging.Logger;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestResult {

	Logger log = Logger.getLogger(TestResult.class.getName());
	public void markFinal(String testName, Boolean result, String resultMessage, ExtentTest test) {
		if (result == false) {
			log.info("Test Failed");
			test.log(LogStatus.FAIL, "Assertion Failed with Exception");
			assert result = false;
		}
		else {
			log.info("Test Passed");
			test.log(LogStatus.PASS, resultMessage);
			assert result = true;
		}
	}
}
