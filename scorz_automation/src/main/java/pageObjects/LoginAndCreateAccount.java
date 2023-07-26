package pageObjects;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventMetaModifier;
import io.appium.java_client.clipboard.HasClipboard;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;

public class LoginAndCreateAccount extends Methods{

	Logger log = Logger.getLogger(LoginAndCreateAccount.class.getName());
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	int xpoint = (int)(width*0.3);
	int ypoint = (int)(height*0.15);
	
	String _nextButtin = "//android.widget.Button[@content-desc='Next']";
	String _getStartedButton = "//android.view.View[@content-desc='GET STARTED']";
	String _signUpWithGoogle = "//android.widget.Button[@content-desc='Sign up with Google']";
	String gmailIcon = "//android.view.View[@index = 4]";
	String emailField = "//android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View";
	String next = "//android.widget.Button[@content-desc = 'Next']";
	String nextPassword = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
	String gmailPasswordField = "//android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View";
	String _signUpWithFacebook = "//android.widget.Button[@content-desc='Sign up with Facebook']";
	String _facebookContinue = "//android.widget.Button[@content-desc = 'Continue']";
	String _chooseAGoogleAccount = "//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container' and @index=0]";
	String _firstName = "//android.widget.EditText[@index=0]";
	String _lastName = "//android.widget.EditText[@index=1]";
	String _birthday = "//android.widget.EditText[@index=3]";
	//String _birthday = "//android.widget.EditText[@index=2]"; // Changing the birthday Index value for real device.
	//String _birthday = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText";
	String _birthdayBackIcon = "//android.widget.Button[@index=2]";
	String _gender = "//android.widget.RadioButton[@index=4]";
	String _location = "//android.view.View[@content-desc = 'Select one']";
	String _locationValue = "(//android.view.View[@index = 0])[6]";
	String _updateToggle = "//android.widget.Switch[@index =6]";
	String _termsAndConditions = "//android.widget.CheckBox[@index = 7]";
	String _privacyPolicy = "//android.widget.CheckBox[@index = 8]";
	String _createAccount = "//android.widget.Button[@content-desc = 'Create account']";
	String _signUpWithEmail = "//android.view.View[@content-desc='SIGN UP WITH EMAIL']";
	String _emailAddress = "//android.widget.EditText[@text = 'Valid email address']";
	String _password = "//android.widget.EditText[@text = 'Password']";
	String _confirmPassword = "//android.widget.EditText[@text = 'Re - enter password']";
	String _mobileNumber = "//android.widget.EditText[@index = 3]";
	String _nextButtoninEmail = "//android.widget.Button[@content-desc = 'Next']";
	String _confirmationCode = "//android.widget.EditText[@index=0]";
	String _ConfirmButton = "//android.widget.Button[@content-desc = 'Confirm']";
	String _ConfirmationOKButton = "//android.widget.Button[@content-desc = 'Ok']";
	String _backscreenIcon = "//android.widget.Button[@index = 0]";
	//String _loginButton = "//android.view.View[@content-desc = 'Log In']";
	String _loginButton = "//android.view.View/android.view.View[7]";
	String _continueWithEmail = "//android.view.View[@content-desc='CONTINUE WITH EMAIL']";
	String _signUpLink = "(//android.view.View[@index =4])[2]";
	String _emailaddressLogIn = "//android.widget.EditText[@index = 1]";
	String _passwordLogIn = "//android.widget.EditText[@index = 3]";
	String _SignInButton = "//android.view.View[@content-desc = 'LOG IN']";
	String _SignInFailedOKButton = "//android.widget.Button[@content-desc = 'Ok']";
	String _updateToggleOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.Switch";
	String _termsAndConditionsOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox[1]";
	String _privacyPolicyOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox[2]";
	
	String _updateToggleSecond = "//android.widget.Switch[@index =7]";
	String _termsAndConditionsSecond = "//android.widget.CheckBox[@index = 9]";
	String _privacyPolicySecond = "//android.widget.CheckBox[@index = 11]";
	String _enableBluetooth = "//android.widget.Switch[@index = 1]";
	String _locationView = "//android.view.View[@content-desc = 'Select one']";
	String _locationValueField = "//android.view.View[@index = 1]";
	String _birthDayProfile = "//android.widget.EditText[@text = 'Enter Birthday']";
	String _policyCheckBox = "//android.widget.CheckBox[@class = 'android.widget.CheckBox']";
	String _SignUpNextButton = "//android.view.View[@content-desc = 'NEXT']";
	
	public LoginAndCreateAccount(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean initialSetup(ExtentTest test) {
		try {
			log.info("Initial Landing Screens");
			Thread.sleep(3000);
			//this.elementClick(_nextButtin, "xpath",test);
		
			//this.waitforElement(_nextButtin, test);
			
			//this.elementClick(_nextButtin, "xpath",test);
			Thread.sleep(3000);
			this.elementClick(_getStartedButton, "xpath",test);
			
			Thread.sleep(5000);
			return true;
			
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean invalidCreateAccount(ExtentTest test) {
		try {
			log.info("Account Creation - Invalid Data");
			Thread.sleep(15000);
			this.scrollDown(test);
			Thread.sleep(3000);
			this.elementClick(_updateToggle, "xpath", test);
			
			this.elementClick(_privacyPolicy, "xpath", test);
			this.waitforElement(_createAccount, test);
			this.elementClick(_createAccount, "xpath", test);
			Thread.sleep(3000);
			this.elementClick(_updateToggle, "xpath", test);
			this.scrollDown(test);
			Thread.sleep(5000);
			
			this.elementClick(_privacyPolicy, "xpath", test);
			Thread.sleep(3000);
			this.scrollUp(test);
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean createAccount(ExtentTest test) {
		try {
			log.info("Account Creation - Valid Data");
			Thread.sleep(15000);
			this.sendKeys(_firstName, "xpath", "Karthi", test);
			this.sendKeys(_lastName, "xpath", "Jeeva", test);
			this.hideKeyboard(test);
			Thread.sleep(5000);
			this.waitforElement(_location, test);
			Thread.sleep(5000);
			this.elementClick(_location, "xpath", test);
			Thread.sleep(3000);
			
//			((HasClipboard) driver).setClipboardText("New York");
//			Thread.sleep(5000);
//			TouchAction touchAction = new TouchAction(driver);
//			
//			touchAction.tap(PointOption.point(250, 300))
//			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
//			.tap(PointOption.point(250, 300)).release().perform();
			
			
//			Thread.sleep(3000);
//			touchAction.tap(new PointOption().withCoordinates(172,172)).release().perform();
//		    Thread.sleep(5000);
//			driver.getKeyboard().sendKeys("Aaronsburg, Pennsylvania, USA");
//			this.waitforElement(_locationValue, test);
			Thread.sleep(2000);
			this.elementClick(_locationValue, "xpath", test);
			Thread.sleep(5000);
			this.hideKeyboard(test);
			Thread.sleep(5000);
			this.scrollDown(test);
			Wait();
			this.waitforElement(_birthday, test);
//			TouchAction touchAction = new TouchAction(driver);
//			touchAction.tap(new PointOption().withCoordinates(250, 750)).perform();
			this.elementClick(_birthday, "xpath", test);
			Thread.sleep(3000);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.waitforElement(_birthdayBackIcon, test);
			this.elementClick(_birthdayBackIcon, "xpath", test);
			Thread.sleep(5000);
			
			this.hideKeyboard(test);
			this.scrollDown(test);
			Thread.sleep(5000);
			this.elementClick(_gender, "xpath", test);
			
			Thread.sleep(5000);
			this.elementClick(_updateToggleSecond, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_termsAndConditionsSecond, "xpath", test);
			Thread.sleep(5000);
//			this.elementClick(_privacyPolicySecond, "xpath", test);
//			Thread.sleep(5000);
			this.waitforElement(_createAccount, test);
			this.elementClick(_createAccount, "xpath", test);
			Thread.sleep(10000);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}
	public boolean createAccountWithGmail(ExtentTest test) {
		try {
			log.info("Create Account With Gmail");
			Thread.sleep(5000);
			this.elementClick(gmailIcon, "xpath", test);
			Thread.sleep(10000);
			this.elementClick(emailField, "xpath", test);
			Wait();
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.J));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.V));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.Y));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.H));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.G));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PERIOD));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			this.hideKeyboard(test);
			this.elementClick(next, "xpath", test);
			Wait();
			Wait();
			this.elementClick(gmailPasswordField, "xpath", test);
			Wait();
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N)
				    .withMetaModifier(KeyEventMetaModifier.SHIFT_ON));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
			this.hideKeyboard(test);
			this.elementClick(nextPassword, "xpath", test);
			Wait();
			Wait();
//			this.invalidCreateAccount(test);
//			boolean rs = this.createAccount(test);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean createAccountwithFacebook(ExtentTest test) {
		try {
			log.info("Create Account with Facebook");
			this.elementClick(_signUpWithFacebook, "xpath", test);
			this.waitforElement(_facebookContinue, test);
			this.elementClick(_facebookContinue, "xpath", test);
			boolean rs = this.createAccount(test);
			return rs;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean invalidAccountcreationEmail(ExtentTest test) {
		
		try {
			log.info("Account Creation with Email - Invalid Data");
			Thread.sleep(5000);
			this.elementClick(_signUpWithEmail, "xpath", test);
			this.sendKeys(_emailAddress, "xpath", "jeevasuriya.sgmail.co", test);
			this.hideKeyboard(test);
			this.scrollDown(test);
			this.sendKeys(_password, "xpath", "Namakkal123#", test);
			this.hideKeyboard(test);
			this.waitforElement(_confirmPassword, test);
			this.sendKeys(_confirmPassword, "xpath", "Namakkal13#", test);
			this.hideKeyboard(test);
			this.waitforElement(_mobileNumber, test);
			//this.sendKeys(_mobileNumber, "xpath", "54", test);
			this.elementClick(_mobileNumber, "xpath", test);
			Thread.sleep(5000);
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(new PointOption().withCoordinates(300,1600)).perform();
		    Thread.sleep(5000);

			this.hideKeyboard(test);
			Thread.sleep(5000);
			this.elementClick(_nextButtoninEmail, "xpath", test);
			Thread.sleep(5000);
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean createAccountwithEmail(ExtentTest test) {
		try {
			log.info("Account Creation with Email - Valid Data");
			Thread.sleep(5000);
			this.elementClick(_continueWithEmail, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_signUpLink, "xpath", test);
			Wait();
			this.elementClick(_emailAddress, "xpath", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.Z));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.P));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.P));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PERIOD));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			this.hideKeyboard(test);

			this.sendKeys(_password, "xpath", "namakkal#", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.POUND));
			this.hideKeyboard(test);
			this.sendKeys(_confirmPassword, "xpath", "namakkal#", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.POUND));
			this.hideKeyboard(test);
			Thread.sleep(3000);
			this.scrollDown(test);
			this.scrollDown(test);
			this.elementClick(_locationView, "xpath", test);
			Wait();
			this.elementClick(_locationValueField, "xpath", test);
			Wait();
			this.hideKeyboard(test);
			this.scrollDown(test);
			this.scrollDown(test);
			this.scrollDown(test);
			this.waitforElement(_birthDayProfile, test);
			this.elementClick(_birthDayProfile, "xpath", test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			this.scrollDownBirthday(test);
			
			this.waitforElement(_birthdayBackIcon, test);
			this.elementClick(_birthdayBackIcon, "xpath", test);
			this.hideKeyboard(test);
			this.scrollDown(test);
			this.elementClick(_policyCheckBox, "xpath", test);
			Wait();
			this.elementClick(_SignUpNextButton, "xpath", test);
			Thread.sleep(7000);
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean invalidLoggingIn(ExtentTest test) {
		try {
			log.info("Invalid Login");
			Thread.sleep(5000);
			this.elementClick(_loginButton, "xpath", test);
			Thread.sleep(5000);
			this.sendKeys(_emailaddressLogIn, "xpath", "scorz@getnada.co", test);
			this.hideKeyboard(test);
			this.sendKeys(_passwordLogIn, "xpath", "Namakkal12", test);
			this.hideKeyboard(test);
			this.elementClick(_SignInButton, "xpath", test);
			Thread.sleep(7000);
			this.waitforElement(_SignInFailedOKButton, test);
			this.elementClick(_SignInFailedOKButton, "xpath", test);
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean loggingIn(ExtentTest test) {
		try {
			log.info("Logged into the application");
			Thread.sleep(5000);
			this.elementClick(_loginButton, "xpath", test);
			Thread.sleep(5000);
			this.sendKeys(_emailaddressLogIn, "xpath", "jeevasuriya.shankar@hashedin.com", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.B));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.D));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.P));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.P));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.G));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.D));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PERIOD));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			this.hideKeyboard(test);
			
			this.sendKeys(_passwordLogIn, "xpath", "Namakkal123#", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.POUND));
			this.hideKeyboard(test);
			
			this.elementClick(_SignInButton, "xpath", test);
			Thread.sleep(25000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			return true;
//			boolean rs = this.createAccount(test);
//			return rs;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean loggingIn_Canary(ExtentTest test) {
		
		try {
			log.info("Logged into the application");
			Thread.sleep(5000);
			this.elementClick(_continueWithEmail, "xpath", test);
			Thread.sleep(5000);
			
			this.sendKeys(_emailaddressLogIn, "xpath", "jeevasuriya.shankar@hashedin.com", test);
			
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.J));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.V));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.Y));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PERIOD));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.H));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.H));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.H));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.D));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PERIOD));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			this.hideKeyboard(test);
			
			this.sendKeys(_passwordLogIn, "xpath", "namakkal#", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.POUND));
			
			this.hideKeyboard(test);
			this.elementClick(_SignInButton, "xpath", test);
			Thread.sleep(25000);
			//driver.switchTo().alert().accept();
			//Thread.sleep(5000);
			return true;

		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean loggingIn_Scorz(ExtentTest test) {
		try {
			log.info("Logged into the application");
			Thread.sleep(5000);
			this.elementClick(_loginButton, "xpath", test);
			Thread.sleep(5000);
			
			this.sendKeys(_emailaddressLogIn, "xpath", "scorzdev@getnada.com", test);
			
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.Z));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.D));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.V));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.G));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.D));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PERIOD));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			this.hideKeyboard(test);
			
			this.sendKeys(_passwordLogIn, "xpath", "Namakkal123#", test);
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.K));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.POUND));
			
			this.hideKeyboard(test);
			this.elementClick(_SignInButton, "xpath", test);
			Thread.sleep(25000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			return true;
//			boolean rs = this.createAccount(test);
//			return rs;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
