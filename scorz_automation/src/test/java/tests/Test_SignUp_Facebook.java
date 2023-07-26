package tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.LoginAndCreateAccount;
import utils.DeviceSetUp;
import utils.Methods;
import utils.TestResult;

public class Test_SignUp_Facebook {

	static AndroidDriver<AndroidElement> driver;
	static ExtentTest test;
	static ExtentReports report;
	public static String userName = "scorz1";
	public static String accessKey = "YBL3gmGqna4o5sknwqyd";
	DeviceSetUp devicesetUp = new DeviceSetUp();
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html",false);
	test = report.startTest("Scorz Automation SignUp and Create Account- Facebook");
	
	}
	
	@Before
	public void setUp() throws MalformedURLException, InterruptedException {
		
		driver = devicesetUp.realdevices();
		
	}
	@Test
	public void signUpFacebooktest() throws IOException, InterruptedException {
		boolean testresult;
		Methods method = new Methods(driver);
		LoginAndCreateAccount login = new LoginAndCreateAccount(driver);
		TestResult ts = new TestResult();
		
		testresult = login.initialSetup(test);	
		testresult = login.createAccountwithFacebook(test);
		Thread.sleep(20000);
		
		
		
		if (testresult == true) {
			test.log(LogStatus.PASS, "Test Passed");
		}
		else {
			test.log(LogStatus.FAIL,test.addScreenCapture(method.capture(driver,test))+ "Test Failed");
			test.log(LogStatus.FAIL, "Test Failed");
		}
		
		ts.markFinal("Create Account", testresult, "Creating a new Account by Signing Up with Facebook", test);
	}

	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
		driver.quit();
	}
}
