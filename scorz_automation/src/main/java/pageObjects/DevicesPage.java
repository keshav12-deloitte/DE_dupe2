package pageObjects;

import java.util.logging.Logger;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;

public class DevicesPage extends Methods{

	Logger log = Logger.getLogger(DevicesPage.class.getName());
	
	String _selectTeam = "//android.widget.RadioButton[@index = 0]";
	String _teamSelectionNext = "//android.widget.Button[@content-desc='Next']";
	String _addDeviceButton = "//android.widget.ImageView[starts-with(@content-desc,'Pair')]";
	//String _allowLocation = "//android.widget.Button[@content-desc = 'ALLOW ONLY WHILE USING THE APP']";
	String _allowLocation = "//android.widget.Button[@content-desc = 'Allow']";
	//String _enableBluetooth = "//android.widget.Switch[@content-desc='Bluetooth.']";
	String _enableBluetooth = "//android.widget.Switch[@index = 1]";
	//String _enableBluetooth = "//android.widget.ImageView[@instance = 10]";
	String _continueButtonInPermissions = "//android.view.View[@content-desc = 'CONTINUE']";
	String _deviceFound = "(//android.widget.ImageView[@index = 0])"; 
	String _connectionSuccessfulContinue = "//android.widget.Button[@content-desc='Continue']";
	String _syncedTeamContinueButton = "//android.widget.Button[@content-desc='Continue']";
	
	String _editTeamsIcon = "//android.view.View[@content-desc = 'Edit teams']";
	String _addmoreteams= "//android.widget.ImageView[@index = 2]";
	String _editdevicesContinue = "//android.widget.Button[@content-desc = 'Continue']";
	String _mydevices = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View";
	String _removedevices = "//android.view.View[@content-desc = 'Remove device']";
	String _confirmationAlert = "//android.widget.Button[@content-desc = 'Yes']";
	String _sendMail = "//android.widget.Button[@content-desc = 'Send us an email']";
	String _composeEmail = "(//android.webkit.WebView[@index = 0])[1]";
	String _sendMailButton = "//android.widget.TextView[@content-desc='Send']";
	String _delayAlerts = "//android.widget.SeekBar";
	String _plusIcon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
	String _budweiserCup = "//android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.ImageView";
	String _budweiserCupSecond = "(//android.widget.ImageView[@index = 0])[1]";
	String _budweiserRedLight = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.ImageView";
	String _budweiserRedLightSecond = "(//android.widget.ImageView[@index = 0])[2]"; 
	String _nextButton = "//android.widget.Button[@content-desc = 'Next']";
	String _getStarted = "//android.view.View[@content-desc = 'GET STARTED']";
	String _redLightVersion = "//android.widget.ImageView[@content-desc = 'Red Light V2 & 3']";
	String _wifiNetworkPassword = "//android.widget.EditText[@index = 3]";
	//String _DeviceTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"; // real device
	//String _DeviceTab = "(//android.view.View[@index = 1])[3]"; // BS device
	String _NHLEditTeams = "//android.view.View[@index = 3]";
	String _selectAFLTeam = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]/android.widget.Button[1]";
	String _editAFLTeams = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]/android.widget.Button[1]";
	String _myScorzCup = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
	String _OkButton = "//android.view.View[@content-desc = 'Ok']";
	String _connectiblesTab = "//android.view.View[starts-with(@content-desc,'Connectibles')]";
	String _connectiblesTabForBSA = "//android.view.View[starts-with(@content-desc,'Connectibles')]";
	
	public DevicesPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean teamSelection(ExtentTest test) {
		try {
			log.info("Selection of Teams");
			Thread.sleep(5000);
			this.elementClick(_selectTeam, "xpath", test);
			//this.elementClick(_teamSelectionNext, "xpath", test);
			Thread.sleep(5000);
			
			this.scrollRight(test);
			this.elementClick(_selectTeam, "xpath", test);
			this.elementClick(_teamSelectionNext, "xpath", test);
			Thread.sleep(10000);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean teamSelectionAndaddDevice(ExtentTest test) {
		
		try {
			log.info("Team Selection and Adding a new Device");
			
			Thread.sleep(5000);
			this.openNotificationBar(test);
			Thread.sleep(5000);
	
			this.elementClick(_enableBluetooth, "xpath", test);
			Thread.sleep(5000);
			this.backbuttonKeyEvent(test);
			
			Thread.sleep(5000);
			
//			budweiserCup(test);
//			Wait();
//			budweiserRedLight(test);
			
			this.elementClick(_connectiblesTabForBSA, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_addDeviceButton, "xpath", test);
			Thread.sleep(5000);
			ScorzCup(test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addScorzCup(ExtentTest test) {
		
		try {
			log.info("Team Selection and Adding a new Device");
			
			Thread.sleep(5000);
			this.openNotificationBar(test);
			Thread.sleep(5000);
	
			this.elementClick(_enableBluetooth, "xpath", test);
			Thread.sleep(5000);
			this.backbuttonKeyEvent(test);
			Thread.sleep(5000);
			this.elementClick(_connectiblesTab, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_addDeviceButton, "xpath", test);
			Thread.sleep(5000);
			ScorzCup(test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void budweiserCup(ExtentTest test) {
		try {
			log.info("Budweiser Cup");
			Wait();
			this.elementClick(_budweiserCupSecond, "xpath", test);
			Wait();
			//this.elementClick(_nextButton, "xpath", test);
			//this.waitforElement(_nextButton, test);
			//this.elementClick(_nextButton, "xpath", test);
			this.waitforElement(_getStarted, test);
			this.elementClick(_getStarted, "xpath", test);
			Wait();
//			driver.switchTo().alert().accept(); //Comment for Virtual Devices
			Thread.sleep(5000);
			
			this.elementClick(_continueButtonInPermissions, "xpath", test);
			Thread.sleep(7000);
			this.elementClick(_deviceFound, "xpath", test);
			Thread.sleep(7000);
			this.elementClick(_connectionSuccessfulContinue, "xpath", test);
			Thread.sleep(7000);
			this.elementClick(_syncedTeamContinueButton, "xpath", test);
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "BudweiserCup Synced successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void ScorzCup(ExtentTest test) {
		try {
			log.info("Scorz Cup");
			Wait();
			this.elementClick(_myScorzCup, "xpath", test);
			Wait();
		
			this.waitforElement(_getStarted, test);
			this.elementClick(_getStarted, "xpath", test);
			Wait();
//			driver.switchTo().alert().accept(); //Comment for Virtual Devices
			Thread.sleep(5000);
			
			this.elementClick(_continueButtonInPermissions, "xpath", test);
			Thread.sleep(10000);
			this.elementClick(_OkButton, "xpath", test);
//			this.elementClick(_deviceFound, "xpath", test);
//			Thread.sleep(7000);
//			this.elementClick(_connectionSuccessfulContinue, "xpath", test);
//			Thread.sleep(7000);
//			this.elementClick(_selectAFLTeam, "xpath", test);
//			Thread.sleep(7000);
//			this.elementClick(_syncedTeamContinueButton, "xpath", test);
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Scorz Cup Synced successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void budweiserRedLight(ExtentTest test) {
		try {
			Thread.sleep(5000);
			this.elementClick(_plusIcon, "xpath", test);
			Wait();
			this.elementClick(_budweiserRedLightSecond, "xpath", test);
			Wait();
			scrollDown(test);
			Wait();
			this.elementClick(_redLightVersion, "xpath", test);
			Wait();
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(new PointOption().withCoordinates(250, 550)).perform();
			driver.getKeyboard().sendKeys("Scorz");
			Wait();
			this.hideKeyboard(test);
			Wait();
			TouchAction touchAction_1 = new TouchAction(driver);
			touchAction_1.tap(new PointOption().withCoordinates(250, 850)).perform();
			driver.getKeyboard().sendKeys("Scorz");
			
			//this.elementClick(_wifiNetworkPassword, "xpath", test);
			//Wait();
			//this.sendKeys(_wifiNetworkPassword, "xpath", "Scorz@123", test);
			Wait();
			this.hideKeyboard(test);
			Wait();
			this.elementClick(_nextButton,"xpath", test);
			Wait();
			this.elementClick(_nextButton, "xpath", test);
			this.waitforElement(_nextButton, test);
			this.elementClick(_nextButton, "xpath", test);
			this.waitforElement(_nextButton, test);
			this.elementClick(_nextButton, "xpath", test);
			this.waitforElement(_getStarted, test);
			this.elementClick(_getStarted, "xpath", test);
			Wait();
			this.elementClick(_connectionSuccessfulContinue, "xpath", test);
			Thread.sleep(5000);
			this.elementClick(_syncedTeamContinueButton, "xpath", test);
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Budweiser Red Light Synced successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean editTeams(ExtentTest test) {
		
		try {
			log.info("Editing the teams");
			this.elementClick(_mydevices, "xpath", test);
			Thread.sleep(3000);
			
			this.elementClick(_NHLEditTeams, "xpath", test);
			Wait();
			this.elementClick(_editTeamsIcon, "xpath", test);
			Thread.sleep(3000);
			this.elementClick(_addmoreteams, "xpath", test);
			Thread.sleep(3000);
//			this.elementClick(_editAFLTeams, "xpath", test);
//			Thread.sleep(3000);
			this.scrollRight(test);
			Thread.sleep(3000);
			this.elementClick(_addmoreteams, "xpath", test);
			Wait();
			//this.elementClick(_addmoreteams, "xpath", test);
			this.elementClick(_editdevicesContinue, "xpath", test);
			test.log(LogStatus.PASS, "Teams has been edited successfully");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Editing the team failed with Exception");
			return false;
		}
	}
	
	public void delayAlerts(ExtentTest test) {
		try {
			log.info("Delay Slide Bar");
			Thread.sleep(3000);
			this.elementClick(_delayAlerts, "xpath", test);
			Thread.sleep(2000);
			this.elementClick(_delayAlerts, "xpath", test);
			test.log(LogStatus.PASS, "Delayed Alerts successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Delayed Alerts failed with exception");
		}
	}
	public boolean removeTeams(ExtentTest test) {
		
		try {
			log.info("Removal of Teams");
			Thread.sleep(5000);
			this.elementClick(_mydevices, "xpath", test);
			Thread.sleep(5000);
			this.scrollDown(test);
			Thread.sleep(3000);
			delayAlerts(test);
			Thread.sleep(3000);
			this.elementClick(_removedevices, "xpath", test);
			Thread.sleep(3000);
			this.elementClick(_confirmationAlert, "xpath", test);
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Device has been removed successfully");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Removing the device failed with Exception");
			return false;
		}
	}
	
	public boolean sendEmail(ExtentTest test) {
		
		try {
			log.info("Sending an Email");
			Thread.sleep(5000);
			this.elementClick(_mydevices, "xpath", test);
			Wait();
			this.scrollDown(test);
			Wait();
			this.elementClick(_sendMail, "xpath", test);
			this.waitforElement(_composeEmail, test);
			this.sendKeys(_composeEmail, "xpath", "Test Automation Device", test);
			this.waitforElement(_sendMailButton, test);
			this.elementClick(_sendMailButton, "xpath", test);
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Mail has been sent successfully");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Mail Sent failed with Exception");
			return false;
		}
	}
	
}
