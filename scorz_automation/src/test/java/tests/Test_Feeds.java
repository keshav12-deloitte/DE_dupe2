package tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.FeedsPage;
import pageObjects.LoginAndCreateAccount;
import pageObjects.MatchDay;
import pageObjects.ProfilePage;
import utils.DeviceSetUp;
import utils.Methods;
import utils.TestResult;

public class Test_Feeds {

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
	
	test = report.startTest("Scorz Automation - Login, Account Creation, Team Selection and Device Sync Up");
	
	}
	
	@Before
	public void setUp() throws MalformedURLException, InterruptedException {
		
		// Desired Capabilities for Real Devices
		
		//driver = devicesetUp.realdevices_Scorz();
		
		// Desired Capabilities for Browser Stack Real Devices
		
		driver = devicesetUp.browserStackDevice_Android_Scorz();
	    
	    // Desired Capabilities for Emulators
	    
		//driver = devicesetUp.emulatorDevice();
		
	}
	@Test
	public void test() throws InterruptedException, IOException {
		
		boolean testresult;
		Methods method = new Methods(driver);
		LoginAndCreateAccount login = new LoginAndCreateAccount(driver);
		FeedsPage feeds = new FeedsPage(driver);
		ProfilePage profile = new ProfilePage(driver);
	
		
		TestResult ts = new TestResult();
		
		testresult = login.initialSetup(test);
		testresult = login.loggingIn_Canary(test);
		Thread.sleep(15000);
		//testresult = feeds.breakingNews(test);
		testresult = feeds.socialFeature(test);
		testresult = feeds.twitterFeed(test);
		testresult = feeds.youtubeFeeds(test);
		
		
		if (testresult == true) {
			test.log(LogStatus.PASS, "Test Passed");
		}
		else {
			test.log(LogStatus.FAIL,test.addScreenCapture(method.capture(driver,test))+ "Test Failed");
			test.log(LogStatus.FAIL, "Test Failed");
		}
		
		ts.markFinal("Create Account", testresult, "Creating a new Account by Logging in with excisting user", test);
	}

	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
		driver.quit();
	}
}
