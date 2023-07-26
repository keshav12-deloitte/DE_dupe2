package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.Dimension;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.MethodsIOS;
import utils.TestResult;

public class LoginAndCreateAccountiOS extends MethodsIOS{

	Logger log = Logger.getLogger(LoginAndCreateAccountiOS.class.getName());
	String _bluetoothOKbutton = "//XCUIElementTypeButton[@name='OK']";
	String _bluetoothClosebutton = "//XCUIElementTypeButton[@name='Close']";
	String _allownotificationsButton = "//XCUIElementTypeButton[@name='Allow']";
	
	boolean testresult;
	MethodsIOS methodios = new MethodsIOS(driver);
	TouchAction touchAction = new TouchAction(driver);
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	
	public LoginAndCreateAccountiOS(IOSDriver<IOSElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean logIn_iOS(ExtentTest test) {
		
		try {
			log.info("Logging into the application - iOS");
			this.elementClick(_bluetoothOKbutton, "xpath", test);
			//this.elementClick(_bluetoothClosebutton, "xpath", test);
			touchAction.tap(new PointOption().withCoordinates(260, 460)).perform();// Close Button
		    Thread.sleep(3000);
			//this.elementClick(_allownotificationsButton, "xpath", test);
		    touchAction.tap(new PointOption().withCoordinates(260, 460)).perform();// Allow Button
			Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width/2, height - 72)).perform();// Get Started
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 535)).perform();// Continue With Email
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width/2, 540)).perform();// Continue With Email
		    Thread.sleep(5000);
		   
		    touchAction.tap(new PointOption().withCoordinates(width/2, 480)).perform();// LogIn Email Address
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("jeevasuriya.shankar@hashedin.com");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 580)).perform();// LogIn Email Password
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("namakkal#");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 680)).perform();// SignIn Button
		    Thread.sleep(25000);
		    test.log(LogStatus.PASS, "Logged into the application");
		    return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Logged Failed with Exception");
			return false;
		}
	}
	
	
	public boolean logIn_iOS_Scorz(ExtentTest test) {
		
		try {
			log.info("Logging into the application - iOS");
			this.elementClick(_bluetoothOKbutton, "xpath", test);
			//this.elementClick(_bluetoothClosebutton, "xpath", test);
			touchAction.tap(new PointOption().withCoordinates(260, 460)).perform();// Close Button
		    Thread.sleep(3000);
			//this.elementClick(_allownotificationsButton, "xpath", test);
		    touchAction.tap(new PointOption().withCoordinates(260, 460)).perform();// Allow Button
			Thread.sleep(5000);
			touchAction.tap(new PointOption().withCoordinates(260, 460)).perform();// Allow Button
			Thread.sleep(5000);
			
		    touchAction.tap(new PointOption().withCoordinates(width/2, height - 72)).perform();// Get Started
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(180, 570)).perform();// Continue With Email
		    Thread.sleep(5000);
		   
		    touchAction.tap(new PointOption().withCoordinates(width/2, 510)).perform();// LogIn Email Address
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("jeevasuriya.shankar@hashedin.com");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 610)).perform();// LogIn Email Password
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("namakkal#");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 710)).perform();// SignIn Button
		    Thread.sleep(10000);
		    
		    test.log(LogStatus.PASS, "Logged into the application");
		    return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Logged Failed with Exception");
			return false;
		}
	}

	public boolean logIn_iOS_profile(ExtentTest test) {
		
		try {
			log.info("Logging into the application - iOS");
			this.elementClick(_bluetoothOKbutton, "xpath", test);
			
			Thread.sleep(5000);

		    touchAction.tap(new PointOption().withCoordinates(width - 186, height - 72)).perform();// Get Started
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(275, 778)).perform();// Log In
		    Thread.sleep(5000);
		  
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 225)).perform();// LogIn Email Address
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("scorzdev@getnada.com");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 325)).perform();// LogIn Email Password
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("Namakkal123#");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 67)).perform();// SignIn Button
		    Thread.sleep(25000);
		    test.log(LogStatus.PASS, "Logged into the application");
		    return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Logged Failed with Exception");
			return false;
		}
	}
	
	
	public boolean createAccount_iOS(ExtentTest test) {
		
		try {
			log.info("Create Account - iOS");
			touchAction.tap(new PointOption().withCoordinates(width - 193, height - 607)).perform();// FirstName
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("Karthi");
		    methodios.hideKeyboardiOS(test);
		    
		    //System.out.println(driver.getPageSource());
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 507)).perform();// SurName
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("Jeeva");
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193, 385)).perform(); //Location
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 507)).perform();// Location Value
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,465)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,475)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,485)).perform();// Birthday
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,495)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,505)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,515)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,525)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 193 ,535)).perform();
		    
		    Thread.sleep(5000);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			Thread.sleep(3000);
			touchAction.tap(new PointOption().withCoordinates(width - 17, height - 404)).perform();// Birthday Typed
		    Thread.sleep(5000);
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(3000);
			touchAction.tap(new PointOption().withCoordinates(width - 310 , 550)).perform();// Gender
		    Thread.sleep(5000);
			
		    /*touchAction.tap(new PointOption().withCoordinates(width - 193, height - 362)).perform();// Birthday
		    Thread.sleep(5000);
		    
		    methodios.scrollDown(test);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 17, height - 404)).perform();// Birthday Typed
		    Thread.sleep(5000);
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 310 ,height - 262)).perform();// Gender Selection
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 162)).perform();// Location
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 462)).perform();// Location Value
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);*/
		    
		    methodios.scrollDown(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 220)).perform();// Notification SB
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 195)).perform();// Notification SB
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 190)).perform();// Notification SB
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 185)).perform();// TC CB
		    Thread.sleep(5000);
		    
//		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 180)).perform();// TC CB
//		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 175)).perform();// TC CB
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 150)).perform();// PP CB
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40 ,height - 122)).perform();// PP CB
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Create Account Button
		    System.out.println("Account Created");
		    Thread.sleep(10000);
		    this.elementClick(_allownotificationsButton, "xpath", test);
		    Thread.sleep(7000);
		    test.log(LogStatus.PASS, "Created a new account successfully");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Account creation failed with exception");
			return false;
		}
	}
	
	public boolean teamSelection_iOS(ExtentTest test) {
		try {
			log.info("Team Selection - iOS");
			Thread.sleep(5000);
			touchAction.tap(new PointOption().withCoordinates(width-75 ,height - 562)).perform();// Team select option
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width-75 ,height - 462)).perform();// Team select option
		    Thread.sleep(5000);
		    
		    this.scrollRight(test);
		    
		    Thread.sleep(5000);
			touchAction.tap(new PointOption().withCoordinates(width-75 ,height - 562)).perform();// Team select option
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width-75 ,height - 462)).perform();// Team select option
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Next - Team Select
		    Thread.sleep(10000);
		    test.log(LogStatus.PASS, "Team has been selected successfully");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Team selection failed with exception");
			return false;
		}	
	}
	
	
}
