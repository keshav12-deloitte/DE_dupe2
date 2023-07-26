package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MethodsIOS {

	Logger log = Logger.getLogger(MethodsIOS.class.getName());
	protected IOSDriver<IOSElement> driver;
	
	public MethodsIOS(IOSDriver<IOSElement> driver) {
		this.driver = driver;
	}
	
	public IOSElement getElementById(String locator) {
		
		IOSElement element;
		element = driver.findElement(MobileBy.id(locator));
		log.info("Element Found By Id - iOS");
		return element;
	}
	public IOSElement getElementByXPath(String locator) {
		
		IOSElement element;
		element = driver.findElement(MobileBy.xpath(locator));
		log.info("Element Found By XPath - iOS");
		return element;
	}
	public void elementClick(String locator,String locatorType,ExtentTest test) {
		
		IOSElement element;
		try {
			if (locatorType == "id") {
				element = this.getElementById(locator);
				element.click();
				test.log(LogStatus.PASS, "Clicked on the element with locator" + locator);
			}
			else if (locatorType == "xpath") {
				element = this.getElementByXPath(locator);
				element.click();
				test.log(LogStatus.PASS, "Clicked on the element with locator" + locator);
			}
			log.info("Element Clicked");		
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Click Method Exception" + locator);
			throw e;
		}
	}
	
	public void sendKeys(String locator,String locatorType,String keysToSend, ExtentTest test) {
		
		IOSElement element;
		try {
			if (locatorType == "id") {
				element = this.getElementById(locator);
				element.click();
				element.sendKeys(keysToSend);
				test.log(LogStatus.PASS, "Sent the data on the element with locator" + locator);
			}
			else if (locatorType == "xpath") {
				element = this.getElementByXPath(locator);
				element.click();
				
				String textVal = element.getText();
				
				int len = textVal.length();
				if (textVal != null) {
					for (int i =0; i<len;i++) {
						driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
					}
					driver.getKeyboard().sendKeys(keysToSend);
					log.info("Keys sent");
					test.log(LogStatus.PASS, "Sent the data on the element with locator" + locator);
				}
				else {
					driver.navigate().back();
					driver.getKeyboard().sendKeys(keysToSend);
					log.info("Keys sent");
					test.log(LogStatus.PASS, "Sent the data on the element with locator" + locator);
					
				}
			}
					
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Send Keys Method Exception" + locator);
			throw e;
		}
	}
	
	public void scrollDown(ExtentTest test) throws InterruptedException {
		try {
			log.info("Swipe Method Down");
			Thread.sleep(3000);

			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			
			int x = width/2;
			int top_y = (int)(height*0.80);
			int bottom_y = (int)(height*0.20);
			
			TouchAction ts = new TouchAction(driver);
			ts.press(PointOption.point(x, top_y))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
					.moveTo(PointOption.point(x, bottom_y)).release().perform();
			test.log(LogStatus.PASS, "Swiped down the screen successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Scroll down Method Exception");
			throw e;
		}
		
	}
	
	public void scrollDownBirthday(ExtentTest test) throws InterruptedException {
		try {
			log.info("Swipe Method Down");
			Thread.sleep(3000);

			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int x = (int)(width*0.75);
			int top_y = (int)(height*0.70);
			int bottom_y = (int)(height*0.55);
			
			TouchAction ts = new TouchAction(driver);
			ts.press(PointOption.point(x, bottom_y))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
					.moveTo(PointOption.point(x, top_y)).release().perform();
			test.log(LogStatus.PASS, "Swiped down the screen successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Swipe down Method Exception");
			throw e;
		}
	}
	
	public void scrollUp (ExtentTest test) throws Exception {
		try {
			log.info("Swipe Method Up");
			Thread.sleep(3000);

			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			
			int x = width/2;
			int top_y = (int)(height*0.80);
			int bottom_y = (int)(height*0.40);
			
			TouchAction ts = new TouchAction(driver);
			ts.press(PointOption.point(x, bottom_y))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
					.moveTo(PointOption.point(x, top_y)).release().perform();
			test.log(LogStatus.PASS, "Swiped up the screen successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Swipe up Method Exception");
			throw e;
		}
	}
	
	public void scrollRight (ExtentTest test) throws Exception {
		try {
			log.info("Swipe Method Right");
			Thread.sleep(3000);

			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			
			int x = height/2;
			int width_x = (int)(width*0.80);
			int width_y = (int)(width*0.20);
			
			TouchAction ts = new TouchAction(driver);
			ts.press(PointOption.point(width_x,x))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
					.moveTo(PointOption.point(width_y,x)).release().perform();
			test.log(LogStatus.PASS, "Swiped right the screen successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Swipe Right Method Exception");
			throw e;
		}
	}
	
	public void scrollLeft (ExtentTest test) throws Exception {
		try {
			log.info("Swipe Method Left");
			Thread.sleep(3000);

			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			
			int x = height/2;
			int width_x = (int)(width*0.80);
			int width_y = (int)(width*0.20);
			
			TouchAction ts = new TouchAction(driver);
			ts.press(PointOption.point(width_y,x))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
					.moveTo(PointOption.point(width_x,x)).release().perform();
			test.log(LogStatus.PASS, "Swiped right the screen successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Swipe Right Method Exception");
			throw e;
		}
	}
	
	public void hideKeyboard(ExtentTest test) {
		try {
		driver.navigate().back();
		log.info("Keyboard Hidden");
		test.log(LogStatus.PASS, "Keyboard Hidden Successful");
		
		}catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Keyboard Hidden Failed");
			throw e;
		}
	}
	
	public void waitforElement(String locator, ExtentTest test) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(locator)));
		log.info("Waiting for the Element to Appear");
		test.log(LogStatus.PASS, "Waited for the element with locator" + locator);
		
		}catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Element is not visible on the screen");
			throw e;
		}
	}
	
	public void taponElement(int x, int y, ExtentTest test) throws InterruptedException {
		try {
			log.info("Tapping on an Element");
			TouchAction touchAction = new TouchAction(driver);
		    touchAction.tap(new PointOption().withCoordinates(x, y)).perform();
		    Thread.sleep(5000);
		    test.log(LogStatus.PASS, "Tapping on the element Successfull");
	    
		}catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Tapping on the element Failed");
			throw e;
		}
	}
	public void sendKeysios(String keysToSend,ExtentTest test) throws Exception {
		try {
			log.info("Send Keys - iOS");
			Thread.sleep(5000);
			driver.getKeyboard().sendKeys(keysToSend);
			test.log(LogStatus.PASS, "Sent the data on the element");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Send Keys Method Exception");
			throw e;
		}
	}
	
	public void hideKeyboardiOS(ExtentTest test) throws Exception {
		try {
			log.info("Hide Keyboard - iOS");
			Thread.sleep(5000);
			driver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done");
			test.log(LogStatus.PASS, "Keyboard Hidden Successful");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Keyboard Hidden Failed");
			throw e;
		}
	}
	
	public String capture(IOSDriver<IOSElement> driver, ExtentTest test) throws IOException {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
			+ ".png");
			String errflpath = Dest.getAbsolutePath();
			FileUtils.copyFile(scrFile, Dest);
			test.log(LogStatus.PASS, "Screenshot Capture Successfull");
			log.info("Failure Screenshot Capture");
			return errflpath;
		
		}catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Screenshot Capture Failed");
			throw e;
		}
	}
}
