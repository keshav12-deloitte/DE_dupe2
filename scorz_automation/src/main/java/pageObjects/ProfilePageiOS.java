package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.MethodsIOS;

public class ProfilePageiOS extends MethodsIOS {
	
	Logger log = Logger.getLogger(CouponsPageiOS.class.getName());
	String _allownotificationsButton = "//XCUIElementTypeButton[@name='Allow']";
	
	boolean testresult;
	MethodsIOS methodios = new MethodsIOS(driver);
	TouchAction touchAction = new TouchAction(driver);
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	public ProfilePageiOS(IOSDriver<IOSElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean editProfile(ExtentTest test) {
		
		try {
			log.info("Profile Edit");
			
//			Thread.sleep(5000);
//			this.elementClick(_allownotificationsButton, "xpath", test);
		    Thread.sleep(7000);
		    
		    touchAction.tap(new PointOption().withCoordinates(100, 100)).perform();// Skip the assistance
		    Thread.sleep(5000);
		    
			touchAction.tap(new PointOption().withCoordinates(325, 750)).perform();// Profile Tab
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 150)).perform();// Profile Tab
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 50, 120)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 50, 130)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 50, 140)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 50, 150)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 50, 160)).perform();
		    touchAction.tap(new PointOption().withCoordinates(width - 50, 170)).perform();
		    Thread.sleep(5000);
		    
//		    this.scrollUp(test);
//		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 280)).perform();// First Name
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 300)).perform();// First Name
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    
		    driver.getKeyboard().sendKeys("Jeeva");
		   
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 380)).perform();// First Name
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 400)).perform();// First Name
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 420)).perform();
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
		    
		    driver.getKeyboard().sendKeys("Surya");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    this.scrollDown(test);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 480)).perform();// DOB
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 500)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 520)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width - 195, 550)).perform();
		    this.scrollDownBirthday(test);
		    Thread.sleep(3000);
			touchAction.tap(new PointOption().withCoordinates(width - 17, height - 404)).perform();// Birthday Typed
		    Thread.sleep(5000);
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(3000);
		    this.scrollDown(test);
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(width-75, height - 200)).perform();
		    Thread.sleep(3000);
		    touchAction.tap(new PointOption().withCoordinates(30, 50)).perform();
		    Thread.sleep(3000);
		    touchAction.tap(new PointOption().withCoordinates(30, 50)).perform();
		    Thread.sleep(5000);
		    
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean editTeams(ExtentTest test) {
		
		try {
			log.info("Edit Teams");
			Thread.sleep(5000);
			
			touchAction.tap(new PointOption().withCoordinates(width/2, 250)).perform();// Profile Tab
		    Thread.sleep(5000);
			
			touchAction.tap(new PointOption().withCoordinates(width/2, 100)).perform();// Edit Teams Link
		    Thread.sleep(5000);
			
		    touchAction.tap(new PointOption().withCoordinates(30,50)).perform();
		    Thread.sleep(5000);
		    
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean FAQ_termsAndConditions(ExtentTest test) {
		
		try {
			log.info("FAQ,Terms and Conditions and Privacy Policy");
			Thread.sleep(5000);
			
			//touchAction.tap(new PointOption().withCoordinates(width/2,540)).perform();
			
			touchAction.tap(new PointOption().withCoordinates(width/2, 350)).perform();// FAQ
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 450)).perform();
		    Thread.sleep(5000);
			
		    touchAction.tap(new PointOption().withCoordinates(30, 50)).perform();
		    Thread.sleep(2000);
		    touchAction.tap(new PointOption().withCoordinates(30, 50)).perform();
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2,550)).perform();
		    Thread.sleep(5000);
		    touchAction.tap(new PointOption().withCoordinates(30, 50)).perform();
		    Thread.sleep(2000);
		    this.scrollDown(test);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
