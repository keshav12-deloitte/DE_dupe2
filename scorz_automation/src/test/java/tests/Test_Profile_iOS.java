package tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.LoginAndCreateAccount;
import pageObjects.LoginAndCreateAccountiOS;
import pageObjects.MatchDayiOS;
import pageObjects.ProfilePageiOS;
import pageObjects.CouponsPageiOS;
import pageObjects.DevicesPageiOS;
import utils.MethodsIOS;
import utils.TestResult;

public class Test_Profile_iOS {

	static IOSDriver<IOSElement> driver;
	public static String userName = "scorz1";
	public static String accessKey = "YBL3gmGqna4o5sknwqyd";
	static ExtentTest test;
	static ExtentReports report;
	
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test = report.startTest("Scorz Automation");
	
    
	}
	
	@Before
	public void setUp() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "iPhone 11 Pro");
	    caps.setCapability("os_version", "13");
	    caps.setCapability("platformName","iOS");
		caps.setCapability("automationName", "XCUITest");
		
		caps.setCapability("app", "bs://ca0b277071f38068e654463dc43f71d904bc766b"); // Sales - iOS - Jul-14-1.8.0- Prod

		//caps.setCapability("app", "bs://b32de22ba987375162f10757cfb6af8fa7df129e"); // Budweiser -iOS - Jul-2 - 3.11.5-Prod
		//caps.setCapability("app", "bs://352fae2e33d2adc4ad37ac79056e03d23c28f034"); // Budweiser - iOS - May - 28 - 3.11.0 - Prod
		//caps.setCapability("app", "bs://54fd9e3a2598b9c631668c8b3d27710af573ed87"); // Budweiser - iOS - Apr - 29 - 3.8.0 - Prod
		//caps.setCapability("app", "bs://3088106cbdb69792e8e23f1877a5d90e69820ebe"); // Budweiser - iOS - Apr - 2 - 3.7.5 - Prod 
		//caps.setCapability("app", "bs://ce15b4840d791962ef5b7fa41883da94878969e8"); // Budweiser - iOS - Feb - 26 - 3.7.3 - Canary
		//caps.setCapability("app", "bs://eb425e6ef1386f672c172ad4da0a08bd9bb1c06e"); // Budweiser - iOS - Feb - 19 - 3.7.2 - Canary
		//caps.setCapability("app", "bs://444435cbb7e3238ecca638fcd2f947f3f52c5632"); // Budweiser -iOS - Feb-12 - 3.7.0 - Canary
		//caps.setCapability("app", "bs://1ff131baa7dab503729a3d520ad18382156764ca"); // Budweiser -iOS - Jan-29 - 3.6.3 - Canary
		//caps.setCapability("app", "bs://1213fad3e4a117152df659fdca7b323fcd979546"); // Budweiser -iOS - Jan-18 - 3.6.1 - Canary
		//caps.setCapability("app", "bs://2c11c29a1a5cd81ef225e9f34192c43acce6e016"); // Budweiser -iOS -Dec - 30 - 3.4.2.2 - Canary
		//caps.setCapability("app", "bs://770a67e5baf7639baf1d368d671e5eb4c41be382"); // Budweiser -iOS -Dec - 21 - 3.4.1 - Canary
		//caps.setCapability("app", "bs://ec5d791ba8dcf90a98b066ac539d7a64485ed34d"); // Budweiser -iOS -Dec - 8 - 3.3.0 - Canary
		//caps.setCapability("app", "bs://556037c222bdf2b3355768cc2b08be9165ee6d9a"); // Budweiser - iOS - Nov - 27 - 3.1.0- Canary		
		//caps.setCapability("app", "bs://cee12bdc887a3024987031adf264f4776efde9cc"); // Budweiser - iOS - Nov - 23 - 3.0.1- Canary
	
		driver = new IOSDriver<IOSElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
		Thread.sleep(7000);
	}
	@Test
	public void profiletestiOS() throws Exception {
		
		boolean testresult;
		MethodsIOS methodios = new MethodsIOS(driver);
		LoginAndCreateAccountiOS accountios = new LoginAndCreateAccountiOS(driver);
		ProfilePageiOS profile = new ProfilePageiOS(driver);
		
		TestResult ts = new TestResult();
		
		testresult = accountios.logIn_iOS_Scorz(test);
		testresult = profile.editProfile(test);
		testresult = profile.editTeams(test);
		testresult = profile.FAQ_termsAndConditions(test);
		
	    if (testresult == true) {
			test.log(LogStatus.PASS, "Test Passed");
		}
		else {
			test.log(LogStatus.FAIL,test.addScreenCapture(methodios.capture(driver,test))+ "Test Failed");
			test.log(LogStatus.FAIL, "Test Failed");
		}
		
		ts.markFinal("Create Account", testresult, "Creating a new Account by LoggingIn with Existing User - iOS Application",test);
	}
	
	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
		
		driver.quit();
	}
}
