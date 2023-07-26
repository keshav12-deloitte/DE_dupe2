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
import pageObjects.CouponsPage;
import pageObjects.DevicesPage;
import pageObjects.LoginAndCreateAccount;
import pageObjects.MatchDay;
import utils.DeviceSetUp;
import utils.Methods;
import utils.TestResult;

public class Test_Coupons {

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
	
	test = report.startTest("Scorz Automation - Login, Account Creation, Team Selection, Coupons and Match Day");
	
	}
	
	@Before
	public void setUp() throws MalformedURLException, InterruptedException {
		
		//driver = devicesetUp.realdevices_Scorz();
		
		driver = devicesetUp.browserStackDevice_Android_Scorz();
		
	    
	}
	
	@Test
	public void coupontest() throws InterruptedException, IOException {
		
		boolean testresult;
		Methods method = new Methods(driver);
		LoginAndCreateAccount login = new LoginAndCreateAccount(driver);
		DevicesPage devices = new DevicesPage(driver);
		CouponsPage coupon = new CouponsPage(driver);
		MatchDay matches = new MatchDay(driver);
		TestResult ts = new TestResult();
		
		testresult = login.initialSetup(test);
		testresult = login.loggingIn_Canary(test);
		testresult = coupon.loyaltyPoints(test);
//		testresult = matches.matchDay_Scorz(test);
		Thread.sleep(10000);
		
		if (testresult == true) {
			test.log(LogStatus.PASS, "Test Passed");
		}
		else {
			test.log(LogStatus.FAIL,test.addScreenCapture(method.capture(driver,test))+ "Test Failed");
			test.log(LogStatus.FAIL, "Test Failed");
		}
		
		ts.markFinal("Selection of Coupons", testresult, "Selection of Coupons", test);
		
	}
	
	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
		driver.quit();
	}
	

}
