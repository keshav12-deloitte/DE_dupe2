package pageObjects;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.Dimension;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import utils.MethodsIOS;

public class FeedsiOS extends MethodsIOS{

	Logger log = Logger.getLogger(FeedsiOS.class.getName());
	boolean testresult;
	MethodsIOS methodios = new MethodsIOS(driver);
	TouchAction touchAction = new TouchAction(driver);
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	String _allownotificationsButton = "//XCUIElementTypeButton[@name='Allow']";
	
	public FeedsiOS(IOSDriver<IOSElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean twitterFeed(ExtentTest test) {
		
		try {
			log.info("Twitter and Youtube Feeds - iOS");
			
			touchAction.tap(new PointOption().withCoordinates(165 , height - 62)).perform(); // Feeds Tab
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(175 , height - 62)).perform(); // Feeds Tab
		    Thread.sleep(3000);
		    
		    touchAction.tap(new PointOption().withCoordinates(width - 225, height - 762)).perform();// Feeds of any league
		    Thread.sleep(5000);
		    this.scrollUp(test);
		    Thread.sleep(3000);
		    touchAction.tap(new PointOption().withCoordinates(width/2 , 300)).perform();// First Exclusive Posts
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(30,50)).perform(); //Back
		    Thread.sleep(3000);
		    this.scrollDown(test);
		    this.scrollDown(test);
		    
		    this.scrollRight(test);
		    Thread.sleep(5000);
		    this.scrollDown(test);
		    
		    this.scrollRight(test);
		    Thread.sleep(5000);
		    this.scrollDown(test);
		    Thread.sleep(5000);
		 
			/*
			 * touchAction.tap(new PointOption().withCoordinates(340 , 70)).perform();//
			 * league Filter Icon Thread.sleep(5000);
			 * 
			 * TouchAction action = new TouchAction(driver);
			 * action.press(PointOption.point(width/2,
			 * height/2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).
			 * moveTo(PointOption.point(width/2, height-100)).perform(); Thread.sleep(3000);
			 * action.tap(new PointOption().withCoordinates(100, 100)).perform();
			 * Thread.sleep(3000); action.tap(new PointOption().withCoordinates(width/2,
			 * 600)).perform(); Thread.sleep(3000);
			 * 
			 * driver.navigate().back();
			 * 
			 * touchAction.tap(new PointOption().withCoordinates(width - 175, height -
			 * 762)).perform();// Feeds of leagues Thread.sleep(5000);
			 */
		    
		    test.log(LogStatus.PASS, "Twitter and Youtube Feeds - Successful");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Twitter Feeds failed with exception");
			return false;
		}
	}
}
