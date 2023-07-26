package pageObjects;

import java.util.logging.Logger;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;

public class SubscriptionPage extends Methods {

	Logger log = Logger.getLogger(SubscriptionPage.class.getName());
	
	String GooglePlayAppPackageName = "com.android.vending";
	String GooglePlayAppActivityName = "com.google.android.finsky.activities.MainActivity";
	
	public SubscriptionPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	String _profileTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]";
	String _subscribeButton = "//android.widget.Button[@text = 'SUBSCRIBE']";
	String _annualPlanButton = "//android.widget.Button[@text = 'ANNUAL PLAN']";
	String _monthlyOneSport = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.HorizontalScrollView/android.view.View[1]/android.view.View";
	String _selectOneSport = "//android.widget.ImageView[@text = 'AFL']";
	String _completeButton = "//android.widget.Button[@text = 'Complete']";
	String _googlePlaySubscribeButton = "//android.widget.Button[@text = 'Subscribe']";
	String _usePassword = "//android.widget.Button[@text = 'USE PASSWORD']";
	String _passwordTextbox = "(//android.widget.TextView[@index = 1])[2]";
	String _verifyButton = "//android.widget.Button[@text = 'Verify']";
	String _upgradeButton = "//android.widget.Button[@text = 'UPGRADE']";
	String _monthlyTwoSport = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View";
	String _selectSecondSport = "//android.widget.ImageView[@text = 'NFL']";
	String _nextButton = "//android.widget.Button[@text = 'Next']";
	String _profileTabTwo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]/android.view.View[4]";
	String _testScorzSports = "//android.widget.TextView[@text = 'Test: Scorz Sports']";
	String _cancelSubscription = "//android.widget.Button[@text = 'Cancel subscription']";
	String _otherOption = "//android.widget.RadioButton[@text = 'Other']";
	String _continueCancelSubscription = "//android.widget.Button[@text = 'CONTINUE']";
	String _noThanksButton = "//android.widget.Button[@text = 'NO THANKS']";
	String _cancelSubscriptionFinal = "//android.widget.Button[@text = 'CANCEL SUBSCRIPTION']";
	String _monthlyPlan = "//android.widget.Button[@text = 'MONTHLY PLAN']";
	String _subscribeOneSport = "//android.widget.Button[@text = 'Subscribe to 1xSport']";
	String _subscribeTwoSport = "//android.widget.Button[@text = 'Subscribe to 2xSport']";
	
	public boolean subscription(ExtentTest test) {
		try {
			Wait();
			this.elementClick(_profileTab, "xpath", test);
			Wait();
			this.elementClick(_subscribeButton, "xpath", test);
			this.waitforElement(_monthlyPlan, test);
			this.elementClick(_monthlyPlan, "xpath", test);
			Wait();
			this.elementClick(_monthlyOneSport, "xpath", test);
			Wait();
			this.elementClick(_subscribeOneSport, "xpath", test);
			this.waitforElement(_selectOneSport, test);
			this.elementClick(_selectOneSport, "xpath", test);
			Wait();
			this.elementClick(_completeButton, "xpath", test);
			Wait();
			this.waitforElement(_googlePlaySubscribeButton, test);
			this.elementClick(_googlePlaySubscribeButton, "xpath", test);
			this.waitforElement(_usePassword, test);
			this.elementClick(_usePassword, "xpath", test);
			this.waitforElement(_passwordTextbox, test);
			this.sendKeys(_passwordTextbox, "xpath", "", test);
			Wait();
			this.elementClick(_verifyButton, "xpath", test);
			Wait();
			Wait();
			Wait();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean upgradeSubscription(ExtentTest test) {
		
		try {
			Wait();
			Wait();
			this.elementClick(_profileTabTwo, "xpath", test);
			Wait();
			this.elementClick(_upgradeButton, "xpath", test);
			this.waitforElement(_monthlyPlan, test);
			this.elementClick(_monthlyPlan, "xpath", test);
			Wait();
			this.elementClick(_monthlyTwoSport, "xpath", test);
			Wait();
			this.elementClick(_subscribeTwoSport, "xpath", test);
			this.waitforElement(_selectOneSport, test);
			this.elementClick(_selectOneSport, "xpath", test);
			Wait();
			this.elementClick(_selectSecondSport, "xpath", test);
			Wait();
			this.elementClick(_completeButton, "xpath", test);
			Wait();
			this.waitforElement(_nextButton, test);
			this.elementClick(_nextButton, "xpath", test);
			Wait();
			this.waitforElement(_googlePlaySubscribeButton, test);
			this.elementClick(_googlePlaySubscribeButton, "xpath", test);
			this.waitforElement(_usePassword, test);
			this.elementClick(_usePassword, "xpath", test);
			this.waitforElement(_passwordTextbox, test);
			this.sendKeys(_passwordTextbox, "xpath", "", test);
			Wait();
			this.elementClick(_verifyButton, "xpath", test);
			Wait();
			Wait();
			Thread.sleep(7000);
			this.elementClick(_profileTabTwo, "xpath", test);
			Wait();
			this.elementClick(_upgradeButton, "xpath", test);
			Wait();
			this.elementClick(_monthlyPlan, "xpath", test);
			Wait();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean googlePlayCheck(ExtentTest test) {
		
		try {
			Wait();
			Activity activity = new Activity(GooglePlayAppPackageName, GooglePlayAppActivityName);
			driver.startActivity(activity);
			Wait();
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(new PointOption().withCoordinates(158, 158)).perform();
		    Thread.sleep(10000);
		    touchAction.tap(new PointOption().withCoordinates(360, 630)).perform();
		    Thread.sleep(10000);
		    Wait();
		    this.elementClick(_testScorzSports, "xpath", test);
		    Wait();
		    this.elementClick(_cancelSubscription, "xpath", test);
		    Wait();
		    this.elementClick(_noThanksButton, "xpath", test);
		    Wait();
		    this.elementClick(_otherOption, "xpath", test);
		    Wait();
		    this.elementClick(_continueCancelSubscription, "xpath", test);
		    Wait();
		    this.elementClick(_cancelSubscriptionFinal, "xpath", test);
		    Thread.sleep(10000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
