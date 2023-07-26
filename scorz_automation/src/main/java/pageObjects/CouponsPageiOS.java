package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.Dimension;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.MethodsIOS;

public class CouponsPageiOS extends MethodsIOS{

	Logger log = Logger.getLogger(CouponsPageiOS.class.getName());
	boolean testresult;
	MethodsIOS methodios = new MethodsIOS(driver);
	TouchAction touchAction = new TouchAction(driver);
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	public CouponsPageiOS(IOSDriver<IOSElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean searchCouponiOS(ExtentTest test) {
		
		try {
			log.info("SearchCoupons-iOS");
			touchAction.tap(new PointOption().withCoordinates(230, 750)).perform();// Vochers Tab
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 250)).perform();// Vocher Image
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 690)).perform();// Claim Vocher
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 710)).perform();// Go To Vocher
		    Thread.sleep(5000);
		 
		    touchAction.tap(new PointOption().withCoordinates(182, 720)).perform();// Go To Vocher
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(230, 750)).perform();// Vochers Tab
		    Thread.sleep(5000);
		    
		    methodios.scrollDown(test);
		    Thread.sleep(5000);
		    
		    test.log(LogStatus.PASS, "Searching the latest coupons - Successful");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Searching the latest coupons failed with exception");
			return false;
		}	
	}
	
	public boolean searchMyVouchersiOS(ExtentTest test) {
		
		try {
			log.info("SearchVouchers-iOS");
			touchAction.tap(new PointOption().withCoordinates(300, 130)).perform();// My Vochers Header
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 300)).perform();// Vocher Image
		    Thread.sleep(5000);
		    
		    methodios.scrollDown(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(230, 750)).perform();// Vochers Tab
		    Thread.sleep(5000);
		    
		    
		    test.log(LogStatus.PASS, "Searching the my vouchers coupons - Successful");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Searching the my vouchers failed with exception");
			return false;
		}	
	}
		
	public boolean QRScanneriOS(ExtentTest test) {
		
		try {
			log.info("QR Scan and PIN Number to claim Coupons");
			touchAction.tap(new PointOption().withCoordinates(330, 70)).perform();// QR PIN Number
		    Thread.sleep(5000);
		    
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 240)).perform();// Enter PIN
		    Thread.sleep(5000);
		    driver.getKeyboard().sendKeys("DOM20OFFER");
		    Thread.sleep(5000);
		    
		    methodios.hideKeyboardiOS(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 740)).perform();// Submit Button
		    Thread.sleep(5000);
		   
		    touchAction.tap(new PointOption().withCoordinates(182, 750)).perform();// Submit Button
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 765)).perform();// Submit Button
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 700)).perform();// Submit Button
		    Thread.sleep(5000);
		   
		    touchAction.tap(new PointOption().withCoordinates(182, 710)).perform();// Submit Button
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(182, 720)).perform();// Submit Button
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(350, 70)).perform();// Submit Button
		    Thread.sleep(5000);
		    
		    methodios.scrollDown(test);
		    Thread.sleep(5000);
		    
		    touchAction.tap(new PointOption().withCoordinates(230, 750)).perform();// Vochers Tab
		    Thread.sleep(5000);
		    
		    test.log(LogStatus.PASS, "QR Screen Vocher claimed successfully");
		    return true;
		    
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "QR Screen Vocher failed with exception");
			return false;
		}	
	}
	
}
