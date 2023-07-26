package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;

public class CouponsPage extends Methods {

	Logger log = Logger.getLogger(CouponsPage.class.getName());
	TouchAction touchAction = new TouchAction(driver);
	
	String _couponLink = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]";
	String _searchLatest = "//android.widget.EditText[@text = 'Search all offers']";
	//String _searchLatestCouponValue = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
	String _searchLatestCouponValue = "(//android.widget.ImageView[@index = 0])[2]";
	String _claimCoupon = "//android.widget.Button[@text = 'Claim vouchers']";
	String _gotoCoupon = "//android.widget.Button[@text = 'Go to voucher']";
	String _couponLinkTwo = "//android.view.View[@index = 2]";
	String _vouchersTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]";
	String _activeVouchers = "//android.widget.ImageView[@index = 1]";
	String _ScannerImage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
	String _PINNumber = "//android.widget.EditText[@text = 'Enter pin']";
	String _QRScanner = "//android.widget.ImageView[@index = 2]";
	String _QRCancel = "//android.widget.TextView[@text = 'CANCEL']";
	String _SubmitButton = "//android.widget.Button[@text = 'Submit']";
	String _OkButton = "//android.widget.Button[@text = 'Ok']";
	String _QRCloseIcon = "//android.widget.Button[@index = 0]";
	
	String _walletTab = "//android.widget.ImageView[@content-desc=\"wallet\"]";
	String _arcade = "//android.view.View[starts-with(@content-desc,'Arcade')]";
	String _tier = "//android.view.View[starts-with(@content-desc,'SILVER')]";
	String _userLoyaltyPoints = "(//android.view.View[@index = 3])[1]";
	String _tierPoints = "(//android.view.View[@index = 7])[1]";
	String _cycleTime = "(//android.view.View[@index = 7])[1]";
	String _dailyLimitPoints = "(//android.widget.ImageView[@index = 9])";
	String _ChallengesButton = "//android.widget.ImageView[starts-with(@content-desc,'Arcade')]";
	String _takeQuiz = "//android.widget.ImageView[starts-with(@content-desc,'Quizzes')]";
	String _vouchersButton = "//android.widget.ImageView[starts-with(@content-desc,'Vouchers')]";
	String _skipButton = "//android.view.View[@content-desc = 'Skip']";
	
	String _coinHistory = "//android.view.View[@content-desc=\"Coins History\"]";
	String _coinHistoryPoints = "//android.widget.ImageView[@index = 1]";
	String _showMenu = "//android.widget.ImageView[@content-desc=\"Show menu\"]";
	String _expiredCoins = "//android.widget.Button[@content-desc=\"Expired\"]";
	String _voucherOne = "(//android.widget.ImageView[@index = 1])[2]";
	String _MyVouchers = "//android.view.View[starts-with(@content-desc,'MY VOUCHERS')]";
	String _tierProgress = "//android.widget.ImageView[starts-with(@content-desc,'Tier Progress')]";
	
	public CouponsPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean searchCoupon(ExtentTest test) {
		
		try {
			log.info("Search Coupons");
			Thread.sleep(10000);
			
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(new PointOption().withCoordinates(600, 1960)).perform();
			Thread.sleep(5000);
			
//			this.elementClick(_couponLink, "xpath", test);
//			Thread.sleep(10000);
//			this.scrollRight(test);
//			this.scrollRight(test);
//			Thread.sleep(5000);
			
//			this.waitforElement(_searchLatest, test);
//			this.elementClick(_searchLatest, "xpath", test);
//			Thread.sleep(3000);
//			this.hideKeyboard(test);
//			this.sendKeys(_searchLatest, "xpath", "Pick A Pokit", test);
//			Thread.sleep(3000);
			//this.hideKeyboard(test);
//			Thread.sleep(3000);
			this.elementClick(_searchLatestCouponValue, "xpath", test);
			Thread.sleep(5000);
			this.waitforElement(_claimCoupon, test);
			this.elementClick(_claimCoupon, "xpath", test);
//			this.waitforElement(_gotoCoupon, test);
//			this.elementClick(_gotoCoupon, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_OkButton, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_couponLinkTwo, "xpath", test);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean searchVouchers(ExtentTest test) {
		
		try {
			log.info("Search Vouchers");
			Thread.sleep(5000);
			this.elementClick(_vouchersTab, "xpath", test);
			Thread.sleep(5000);
			this.waitforElement(_activeVouchers, test);
			this.elementClick(_activeVouchers, "xpath", test);
			Thread.sleep(5000);
			this.scrollDown(test);
			this.elementClick(_couponLinkTwo, "xpath", test);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean QRScanner(ExtentTest test) {
		
		try {
			log.info("QR Scanner and PIN Number to Claim Coupons");
			Thread.sleep(5000);
			this.elementClick(_ScannerImage, "xpath", test);
//			this.waitforElement(_QRScanner, test);
//			this.elementClick(_QRScanner, "xpath", test);
//			Thread.sleep(3000);
			//driver.switchTo().alert().accept(); //comment for virtual devices.
//			Thread.sleep(5000);
//			this.elementClick(_QRCancel, "xpath", test);
			this.waitforElement(_PINNumber, test);
			this.sendKeys(_PINNumber, "xpath", "NIKE18OFFER", test);
			this.hideKeyboard(test);
			this.waitforElement(_SubmitButton, test);
			this.elementClick(_SubmitButton, "xpath", test);
			Thread.sleep(3000);
			this.elementClick(_OkButton, "xpath", test);
			Thread.sleep(3000);
			this.hideKeyboard(test);
			Wait();
			this.elementClick(_QRCloseIcon, "xpath", test);
			Wait();
			this.scrollDown(test);
			Thread.sleep(5000);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean loyaltyPoints(ExtentTest test) {
		
		try {
			
			log.info("Loyalty Points");
//			this.elementClick(_skipButton, "xpath", test);
//			Wait();
			this.elementClick(_walletTab, "xpath", test);
			Wait();
			this.elementClick(_tier, "xpath", test);
			Wait();
			Wait();
			Wait();
			String userTier = driver.findElement(By.xpath(_tier)).getAttribute("content-desc");
			if ( !userTier.isEmpty() && userTier != null) {
				log.info("User Tier is displayed");
			}
			String userLoyaltyPoints = driver.findElement(By.xpath(_userLoyaltyPoints)).getAttribute("content-desc");
			if ( !userLoyaltyPoints.isEmpty() && userLoyaltyPoints != null) {
				log.info("User Loyalty Points is displayed");
			}
			String tierPoints = driver.findElement(By.xpath(_tierPoints)).getAttribute("content-desc");
			if ( !tierPoints.isEmpty() && tierPoints != null) {
				log.info("Tier Points is displayed");
			}
			String cycleTime = driver.findElement(By.xpath(_cycleTime)).getAttribute("content-desc");
			if ( !cycleTime.isEmpty() && cycleTime != null) {
				log.info("Cycle Time is displayed");
			}
			/*String dailyLimitPoints = driver.findElement(By.xpath(_dailyLimitPoints)).getAttribute("content-desc");
			if ( !dailyLimitPoints.isEmpty() && dailyLimitPoints != null) {
				log.info("Daily Limit Points is displayed");
			}*/
			Wait();
			this.elementClick(_coinHistory, "xpath", test);
			Wait();
			this.elementClick(_coinHistoryPoints, "xpath", test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(200, 200)).perform();
			Wait();
			this.elementClick(_showMenu, "xpath", test);
			Wait();
			this.elementClick(_expiredCoins, "xpath", test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(60, 140)).perform(); 
			Wait();
			Wait();
			this.elementClick(_tierProgress, "xpath", test);
			Wait();
			this.scrollDown(test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(60, 140)).perform();
			Wait();
			Wait();
			Wait();
			this.elementClick(_arcade, "xpath", test);
			
			Wait();
			this.elementClick(_walletTab, "xpath", test);
			Wait();
			this.elementClick(_vouchersButton, "xpath", test);
			Wait();
			this.scrollRight(test);
			Wait();
			this.scrollDown(test);
			Wait();
			this.elementClick(_MyVouchers, "xpath", test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
