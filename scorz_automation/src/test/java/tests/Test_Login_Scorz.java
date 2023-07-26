package tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import pageObjects.DevicesPage;
import pageObjects.LoginAndCreateAccount;
import pageObjects.ProfilePage;
import utils.DeviceSetUp;
import utils.Methods;
import utils.TestResult;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.touch.offset.PointOption;


public class Test_Login_Scorz {
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
	public void logintest() throws IOException, InterruptedException {
		
		boolean testresult;
		Methods method = new Methods(driver);
		LoginAndCreateAccount login = new LoginAndCreateAccount(driver);
		DevicesPage devices = new DevicesPage(driver);
		ProfilePage profile = new ProfilePage(driver);
		TestResult ts = new TestResult();
		
		testresult = login.initialSetup(test);
		//testresult = login.invalidLoggingIn(test);
		testresult = login.loggingIn_Canary(test);
		Thread.sleep(20000);
		//testresult = profile.homescreenAssistanceForScorz(test);
		testresult = devices.addScorzCup(test);

		
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
