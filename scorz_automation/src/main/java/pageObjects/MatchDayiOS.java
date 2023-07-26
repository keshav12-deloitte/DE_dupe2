package pageObjects;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.Dimension;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.MethodsIOS;

public class MatchDayiOS extends MethodsIOS{
	Logger log = Logger.getLogger(CouponsPageiOS.class.getName());
	String _allownotificationsButton = "//XCUIElementTypeButton[@name='Allow']";
	
	boolean testresult;
	MethodsIOS methodios = new MethodsIOS(driver);
	TouchAction touchAction = new TouchAction(driver);
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	public MatchDayiOS(IOSDriver<IOSElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean matchDay(ExtentTest test) {
		try {
			
			log.info("Wallet and Vouchers");
		    touchAction.tap(new PointOption().withCoordinates(300, height-62)).perform();// Wallet Screen
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2, 250)).perform();// Points Wall
		    Thread.sleep(5000);
		    this.scrollDown(test);
		    touchAction.tap(new PointOption().withCoordinates(30,50)).perform(); //Back
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(300, height-280)).perform();// Vouchers Screen
		    Thread.sleep(3000);
		    
		    this.scrollDown(test);
		    this.scrollRight(test);
		    
			log.info("Match Day");
			Thread.sleep(5000);
		    
			touchAction.tap(new PointOption().withCoordinates(30, height-62)).perform();// Match Day
		    Thread.sleep(5000);
		    
		    this.scrollRight(test);
		    Thread.sleep(2000);
		    this.scrollRight(test);
		    Thread.sleep(2000);
		    this.scrollLeft(test);
		    Thread.sleep(2000);
		    this.scrollUp(test);
		    Thread.sleep(2000);
		    
		    touchAction.tap(new PointOption().withCoordinates(90, 70)).perform();// NHL
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(100, 70)).perform();// MLB
		    Thread.sleep(5000);
		    
		    this.scrollLeft(test);
		    Thread.sleep(2000);
		    this.scrollUp(test);
		    Thread.sleep(2000);
		    
		    this.scrollRight(test);
		    Thread.sleep(2000);
		    this.scrollDown(test);
		    Thread.sleep(2000);
		    
		    Thread.sleep(3000);
		    touchAction.tap(new PointOption().withCoordinates(340 , 70)).perform();// league Filter Icon
		    Thread.sleep(5000);
		    
		    TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(width/2, height/2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).moveTo(PointOption.point(width/2, height-100)).perform();
			Thread.sleep(3000);
			action.tap(new PointOption().withCoordinates(100, 100)).perform();
			Thread.sleep(3000);
			
			touchAction.tap(new PointOption().withCoordinates(160 , 150)).perform();// News option
		    Thread.sleep(3000);
			
		    touchAction.tap(new PointOption().withCoordinates(width/2 , 300)).perform();// News option
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(30,50)).perform(); //Back
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(240 , 150)).perform();// Standings option
		    Thread.sleep(3000);
		    
		    this.scrollRight(test);
		    this.scrollDown(test);
		    
		    touchAction.tap(new PointOption().withCoordinates(350 , 150)).perform();// Stadium Events
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2 , 300)).perform();// Stadium Events
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width/2 , 400)).perform();// Stadium Events
		    Thread.sleep(5000);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
