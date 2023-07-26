package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.Dimension;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.MethodsIOS;

public class DevicesPageiOS extends MethodsIOS{

	Logger log = Logger.getLogger(DevicesPageiOS.class.getName());
	String _allownotificationsButton = "//XCUIElementTypeButton[@name='Allow']";
	
	boolean testresult;
	MethodsIOS methodios = new MethodsIOS(driver);
	TouchAction touchAction = new TouchAction(driver);
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	public DevicesPageiOS(IOSDriver<IOSElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean addingNewDevice(ExtentTest test) {
		
		try {
			
			log.info("Adding a new Device - iOS");
			Thread.sleep(5000);
			
//			this.elementClick(_allownotificationsButton, "xpath", test);
//		    Thread.sleep(7000);
		    
			touchAction.tap(new PointOption().withCoordinates(200, height - 62)).perform();// Device Tab
		    Thread.sleep(5000);
			
			touchAction.tap(new PointOption().withCoordinates(width - 193, 200)).perform();// Add a new Device Button
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, 200)).perform();// Budweiser Cup
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193, 220)).perform();// Budweiser Cup
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193, 240)).perform();// Budweiser Cup
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193, 260)).perform();// Budweiser Cup
		    Thread.sleep(5000);
		    
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Get Started
		    Thread.sleep(5000);
		    
//		    this.elementClick(_allownotificationsButton, "xpath", test);
//		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();// Continue Button
		    Thread.sleep(10000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 492)).perform();// Selecting a found device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 512)).perform();// Selecting a found device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 532)).perform();// Selecting a found device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 542)).perform();// Selecting a found device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 562)).perform();// Selecting a found device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();// Continue Button - Connection Successful
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();// Continue Button - Sync teams with device
		    Thread.sleep(5000);
		    
		    test.log(LogStatus.PASS, "Added a new device Successfully");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Adding a new device failed with exception");
			return false;
		}	
	}
	
	public boolean addingRedLight(ExtentTest test) {
		try {
			log.info("Adding a new Budweiser Red Light");
			
			touchAction.tap(new PointOption().withCoordinates(345,65)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(345,70)).perform();
		    Thread.sleep(5000);
		    
			touchAction.tap(new PointOption().withCoordinates(350,75)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(350,80)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(350,90)).perform();
		    Thread.sleep(5000);
		    
			touchAction.tap(new PointOption().withCoordinates(350,100)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(350,110)).perform();
		    Thread.sleep(5000);
		    
			touchAction.tap(new PointOption().withCoordinates(350,120)).perform();
		    Thread.sleep(5000);
		    
//			touchAction.tap(new PointOption().withCoordinates(width - 193, height - 562)).perform();// Add a new Device Button
//		    Thread.sleep(5000);
		    
//		    touchAction.tap(new PointOption().withCoordinates(width - 193,300)).perform();
//		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,320)).perform();
		    Thread.sleep(5000);
//		    touchAction.tap(new PointOption().withCoordinates(width - 193,350)).perform();
//		    Thread.sleep(5000);
//		    touchAction.tap(new PointOption().withCoordinates(width - 193,375)).perform();
//		    Thread.sleep(5000);
		    
		    
		    this.scrollDown(test);
		    Thread.sleep(3000);
		    
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,350)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,375)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,400)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,240)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,250)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,260)).perform();
		    Thread.sleep(5000);
		  
		    driver.getKeyboard().sendKeys("Scorz_WiFi");
		    this.hideKeyboardiOS(test);
		    Thread.sleep(2000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,340)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,350)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 193,360)).perform();
		    Thread.sleep(5000);
		    
		    driver.getKeyboard().sendKeys("Scorz@123");
		    this.hideKeyboardiOS(test);
		    Thread.sleep(2000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Next
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Next
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Next
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193, height - 62)).perform();// Get Started
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();// Continue Button
		    Thread.sleep(5000);
			
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();// Continue Button - Sync teams with device
		    Thread.sleep(5000);
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean editTeams(ExtentTest test) {
		
		try {
			log.info("Editing the existing devices - iOS");
			touchAction.tap(new PointOption().withCoordinates(width - 193 , height - 562)).perform();// My Device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 40, height - 682)).perform();// Edit Teams
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193 , height - 362)).perform();// Add more teams
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 193,height - 62)).perform();// Edit Continue Button
		    Thread.sleep(5000);
		    
		    test.log(LogStatus.PASS, "Edited teams Successfully");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Editing a team failed with exception");
			return false;
		}
	}
	
	public boolean removeTeams(ExtentTest test) {
		try {
			log.info("Removal of Teams - iOS");
			touchAction.tap(new PointOption().withCoordinates(width - 193, height - 562)).perform();// My Device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 295 , 685)).perform();// Remove Device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 295 , 690)).perform();// Remove Device
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 75, height - 112)).perform();// Remove Device Alert
		    Thread.sleep(5000);
		    test.log(LogStatus.PASS, "Device Removed Successfully");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Removing a device failed with exception");
			return false;
		}
	}
	public boolean profile(ExtentTest test) {
		try {
			log.info("Profile Page - iOS");
			Thread.sleep(5000);
			touchAction.tap(new PointOption().withCoordinates(width-50, height - 62)).perform();// My Device
		    Thread.sleep(5000);
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
