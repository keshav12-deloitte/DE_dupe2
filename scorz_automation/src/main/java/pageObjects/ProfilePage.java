package pageObjects;

import java.net.URL;
import java.util.AbstractMap;
import java.util.logging.Logger;

import javax.annotation.Nullable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.CommandExecutionHelper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.appmanagement.BaseTerminateApplicationOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;


public class ProfilePage extends Methods{

	Logger log = Logger.getLogger(ProfilePage.class.getName());
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	TouchAction touchAction = new TouchAction(driver);
	
	String _editProfileButton = "//android.widget.Button[@content-desc = 'Edit Profile']";
	String _firstName = "//android.widget.EditText[@index = 1]";
	String _lastName = "//android.widget.EditText[@index = 3]";
	String _gender = "//android.widget.RadioButton[@index = 7]";
	String _birthDay = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText";
	String _marketingSlider = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch";
	String _confirmButton = "//android.widget.Button[@content-desc = 'Confirm']";
	String _editTeamsLink = "//android.view.View[starts-with(@content-desc,'Leagues')]";
	String _editTeamSelection = "//android.widget.ImageView[@content-desc=\"Baltimore Ravens\"]/android.widget.Button[1]";
	String _continueButton = "//android.widget.Button[@content-desc = 'Continue']";
	String _profileTab = "(//android.widget.ImageView[@content-desc='settings'])[2]";
	String _birthdayBackIcon = "//android.widget.Button[@index=2]";
	String _appReviewYes = "//android.widget.Button[@index=1]";
	String _appReviewNotReally = "//android.widget.Button[@index=0]";
	String _appReviewNo = "//android.widget.Button[@index=2]";
	String _SubmitYesButton = "//android.widget.Button[@content-desc = 'Yes']";
	String _CancelReviewButton = "//android.widget.Button[@content-desc = 'CANCEL']";
	String _sendReview = "//android.widget.Button[@content-desc = 'Send']";
	String _CloseReview = "//android.widget.Button[@content-desc = 'Close']";
	String _settingsViewClick = "(//android.view.View[@index = 0])[7]";
	String _editButton = "//android.widget.Button[@content-desc = 'Edit']";
	String _firstNameProfile = "//android.widget.EditText[@index = 0]";
	String _lastNameProfile = "//android.widget.EditText[@index = 1]";
	String _birthDayProfile = "//android.widget.EditText[@index = 2]";
	String _marketingSwitchProfile = "//android.widget.Switch[@index=3]";
	String _saveButtonProfile = "//android.view.View[@content-desc = 'Save']";
	String _backIconProfile = "//android.widget.Button[@index =0]";
	String _NFLSportsSelection = "//android.widget.ImageView[@index = 2]";
	String _settingsViewAfterEdit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]";
	String _supportTab = "//android.view.View[starts-with(@content-desc,'Support')]";
	String _supportCategory = "//android.widget.Button[@content-desc = 'Others']";
	String _supportReason = "//android.view.View[@content-desc = 'Lights are not in sync']";
	String _requestDetails = "//android.widget.EditText[@index = 1]";
	String _sendRequest = "//android.view.View[@content-desc = 'SEND REQUEST']";
	String _FAQTab = "//android.view.View[starts-with(@content-desc,'FAQ')]";
	String _faqSection = "(//android.view.View[@index =0])[4]";
	String _faqQuestion = "(//android.view.View[@index =0])[5]";
	String _supporLinkInFAQ = "(//android.view.View[@content-desc = 'You can still request for support'])";
	String _termsAndConditions = "//android.view.View[starts-with(@content-desc,'Terms')]";
	String _privacyPolicy = "//android.view.View[starts-with(@content-desc,'Privacy')]";
	String _aboutScorz = "//android.view.View[starts-with(@content-desc,'About')]";
	String _assistMe = "//android.view.View[@content-desc = 'ASSIST ME']";
	String _assistNextButton = "//android.view.View[@content-desc = 'Next']";
	String _assistBackButton = "//android.view.View[@content-desc = 'Back']";
	String _assistFinishButton = "//android.view.View[@content-desc = 'Finish']";
	String _assistCloseButton = "//android.view.View[@content-desc = 'CLOSE']";
	String _connectiblesTab = "//android.view.View[starts-with(@content-desc,'Connectibles')]";
	String _connectiblesTabForBSA = "//android.view.View[starts-with(@content-desc,'Connectibles')]";
	String _skipButton = "//android.view.View[@content-desc = 'Skip']";
	
	public ProfilePage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean editProfile(ExtentTest test) {
		try {
			log.info("Editing the profile details");
			Wait();
	
			this.elementClick(_profileTab, "xpath", test);
			Wait();
			this.elementClick(_settingsViewClick, "xpath", test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(915, 375)).perform();
			touchAction.tap(new PointOption().withCoordinates(915, 380)).perform();
			touchAction.tap(new PointOption().withCoordinates(915, 385)).perform();
			touchAction.tap(new PointOption().withCoordinates(915, 410)).perform();
			touchAction.tap(new PointOption().withCoordinates(915, 415)).perform();// Edit Icon
			touchAction.tap(new PointOption().withCoordinates(915, 420)).perform();
		    Thread.sleep(5000);
			this.sendKeys(_firstNameProfile, "xpath", "Jeeva", test);
			for(int i = 0;i<5;i++) {
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DEL));
			}
			Wait();
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.J));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.V));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			Wait();
			this.sendKeys(_lastNameProfile, "xpath", "Suriya", test);
			for(int i = 0;i<6;i++) {
				((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DEL));
			}
			Wait();
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.Y));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			Wait();
			this.hideKeyboard(test);
			Wait();
			this.waitforElement(_birthDayProfile, test);
			this.elementClick(_birthDayProfile, "xpath", test);
			this.scrollDownBirthday(test);
			this.waitforElement(_birthdayBackIcon, test);
			this.elementClick(_birthdayBackIcon, "xpath", test);
			this.hideKeyboard(test);
			this.scrollDown(test);
			//this.elementClick(_marketingSwitchProfile, "xpath", test);
			Thread.sleep(3000);
			this.elementClick(_saveButtonProfile, "xpath", test);
			Wait();
			//this.elementClick(_settingsViewAfterEdit, "xpath", test);
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
	
			Thread.sleep(5000);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean editTeams(ExtentTest test) {
		
		try {
			log.info("Editing the Favouite and Followed teams");
			Wait();
			this.elementClick(_editTeamsLink, "xpath", test);
			Wait();
			this.elementClick(_NFLSportsSelection, "xpath", test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform();// Back 
			Wait();
			this.scrollDown(test);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean FAQ (ExtentTest test) {
		try {
			log.info("Frequently Asked Questions");
			Wait();
			this.elementClick(_FAQTab, "xpath", test);
			Wait();
			this.elementClick(_faqSection, "xpath", test);
			Wait();
			this.elementClick(_faqQuestion, "xpath", test);
			Wait();
		
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean support(ExtentTest test) {
		try {
			log.info("Support");
			Wait();
			this.elementClick(_supportTab, "xpath", test);
			Wait();
			this.elementClick(_supportCategory, "xpath", test);
			Wait();
			this.elementClick(_supportReason, "xpath", test);
			Wait();
			this.sendKeys(_requestDetails, "xpath", "Test", test);
			Wait();
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			this.hideKeyboard(test);
			Wait();
			this.elementClick(_sendRequest, "xpath", test);
			Wait();
			this.hideKeyboard(test);
			this.backbuttonKeyEvent(test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean termsAndPolicyLinks(ExtentTest test) {
		try {
			log.info("Terms and Conditions & Privacy Policy");
			Wait();
			this.scrollDown(test);
			this.elementClick(_termsAndConditions, "xpath", test);
			Wait();
			Thread.sleep(3000);
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
			Thread.sleep(3000);
			this.elementClick(_privacyPolicy, "xpath", test);
			Wait();
			Thread.sleep(6000);
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
			this.elementClick(_aboutScorz, "xpath", test);
			Wait();
			Thread.sleep(6000);
			touchAction.tap(new PointOption().withCoordinates(70, 140)).perform(); 
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean appReview(ExtentTest test) {
		
		try {
			log.info("App Review - Positive Feedback");
			for (int i = 0; i < 4; i++) {
				Wait();
				Wait();
				Activity activity = new Activity("com.buzzconnect.bsa","com.fandomconnect.scorz.MainActivity");
				activity.setStopApp(true);
				((StartsActivity) driver).startActivity(activity);
				
				Thread.sleep(10000);
			}
			
			Thread.sleep(7000);
			
			this.elementClick(_appReviewYes, "xpath", test);
			Wait();
			Wait();
			
			this.backbuttonKeyEvent(test);
			Wait();
			this.elementClick(_CloseReview, "xpath", test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

	public boolean appReviewNegative(ExtentTest test) {
	
		try {
			log.info("App Review - Negative Feedback");
			for (int i = 0; i < 4; i++) {
				Wait();
				Wait();
				Activity activity = new Activity("com.fandomconnect.scorz","com.fandomconnect.scorz.MainActivity");
				activity.setStopApp(true);
				((StartsActivity) driver).startActivity(activity);
				
				Thread.sleep(10000);
			}
		
			Thread.sleep(7000);		
			this.elementClick(_appReviewNotReally, "xpath", test);
			Wait();
		
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(new PointOption().withCoordinates(width/2,height/2)).perform();
			Wait();
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.P));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
		    Thread.sleep(5000);
		    
			this.elementClick(_CancelReviewButton, "xpath", test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean homescreenAssistance(ExtentTest test) {
		try {
			log.info("Home Screen Assistance");
//			this.elementClick(_connectiblesTabForBSA, "xpath", test);
//			Thread.sleep(5000);
			
			this.elementClick(_assistMe, "xpath", test);
			Wait();
			this.elementClick(_assistNextButton, "xpath", test);
			Wait();
			this.elementClick(_assistNextButton, "xpath", test);
			Wait();
			this.elementClick(_assistNextButton, "xpath", test);
			Wait();
			this.elementClick(_assistFinishButton, "xpath", test);
			Wait();
			this.elementClick(_assistCloseButton, "xpath", test);
			Wait();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean homescreenAssistanceForScorz(ExtentTest test) {
		try {
			log.info("Home Screen Assistance");
			Wait();
			this.elementClick(_assistMe, "xpath", test);
			Wait();
			this.elementClick(_assistNextButton, "xpath", test);
			Wait();
			this.elementClick(_assistNextButton, "xpath", test);
			Wait();
			this.elementClick(_assistNextButton, "xpath", test);
			Wait();
			this.elementClick(_assistFinishButton, "xpath", test);
			Wait();
			this.elementClick(_assistCloseButton, "xpath", test);
			Wait();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
