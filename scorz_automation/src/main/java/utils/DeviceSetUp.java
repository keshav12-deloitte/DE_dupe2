package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class DeviceSetUp {

	static AndroidDriver<AndroidElement> driver;
	public static String userName = "scorz1";
	public static String accessKey = "YBL3gmGqna4o5sknwqyd";
	
	public AndroidDriver<AndroidElement> realdevices() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "10"); 
		capabilities.setCapability("deviceName","Mi A2");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("automationName", "UiAutomator2");

		
		capabilities.setCapability("appPackage", "com.buzzconnect.bsa");
		capabilities.setCapability("appActivity","com.fandomconnect.scorz.MainActivity");
		capabilities.setCapability("app","/home/hasher/Downloads/app-budweiser-release-Prod-3.11.5.apk");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public AndroidDriver<AndroidElement> realdevices_Scorz() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "10"); 
		capabilities.setCapability("deviceName","Mi A2");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app","/home/hasher/Downloads/app-scorzsales-release-1.8.0-Prod-Jul-8.apk");
		capabilities.setCapability("uiautomator2ServerInstallTimeout", 250000);
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public AndroidDriver<AndroidElement> browserStackDevice_Android() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Google Pixel 3");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("platformName","Android");
		caps.setCapability("automationName", "Appium");
		caps.setCapability("appPackage", "com.buzzconnect.bsa");
		caps.setCapability("appActivity","com.fandomconnect.scorz.MainActivity");
		caps.setCapability("autoGrantPermissions", "true");
		
		caps.setCapability("app", "bs://aed8c642718b04cd98228e8f06883cb519fe41a0"); // Budweiser-Jul-Prod-3.12.0
		//caps.setCapability("app", "bs://8ac51808a9fb49305b3c6a08f129fd8ffd1cb058"); // Budweiser - Jul-2 -Prod - 3.11.5
		//caps.setCapability("app", "bs://9ae64b58afd12240997c4c88eed3633743968187"); // Budweiser - May - 28 - Prod - 3.11.0
		//caps.setCapability("app", "bs://80bb827a2f6efdf010aaa2d24d84af2d0674c3d0"); // Budweiser - Apr - 29 - Prod - 3.8.0
		//caps.setCapability("app", "bs://332ad0b22b7a464228243a972f4980ed16b6d63c"); // Budweiser - Apr -2 - Prod - 3.7.5
		//caps.setCapability("app", "bs://69bbd795881569575ce8acf27ceb0791cb326c0b"); // Budweiser - Feb - 26 - Prod - 3.7.3
		//caps.setCapability("app", "bs://85e782517186416c9b4e16db4bcb952261ff7785"); // Budweiser - Feb - 19 - Prod - 3.7.2
		//caps.setCapability("app", "bs://cc974094f2495f651a618e5340ef2d72f74debb7"); // Budweiser - Jan - 29 - Canary - 3.6.3
		//caps.setCapability("app", "bs://d5bbdde11b36aa63ab0ec71628c42ef97d9cba02"); // Budweiser - Jan - 18 - Canary - 3.6.1
		//caps.setCapability("app", "bs://be9b4c433b5fe68735defd7ebf7f817653c42c26"); // Budweiser - Dec - 30 - 3.4.2.2 - Canary
		//caps.setCapability("app", "bs://1be2bd0fa260afe23e2fdbde6e4bd13ad3c55a47"); // Budweiser - Dec - 21 - 3.4.1 - Canary
		//caps.setCapability("app", "bs://7f4f85df8cd12d741f26836d65307e268a6a9a5c"); // Budweiser - Dec - 8 - 3.3 - Canary
		//caps.setCapability("app", "bs://41cc9d638711a4b3fdea463e05b05249bce518eb"); // Budweiser - Dec -4 - 3.2 - Canary
		//caps.setCapability("app", "bs://adaf4be620ad3ee2e1da3a3d60da554f5c7f1ed1"); // Budweiser - Nov-27-3.1.0 - Canary
		//caps.setCapability("app", "bs://54494f5c0c52cf6d01bd4ab6ef67ce6872ef5478"); // Budweiser - Nov-23 -Canary

	    
	    driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

	    Thread.sleep(7000);
	    return driver;
	}
	
	public AndroidDriver<AndroidElement> browserStackDevice_Android_Profile() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Google Pixel 3");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("platformName","Android");
		caps.setCapability("automationName", "Appium");
		caps.setCapability("appPackage", "com.buzzconnect.bsa");
		caps.setCapability("appActivity","com.fandomconnect.scorz.MainActivity");
		caps.setCapability("autoGrantPermissions", "true");
		
		caps.setCapability("app", "bs://49ba8517ff55e85659ca784d711dc94a1acebad0");
		//caps.setCapability("app", "bs://49ba8517ff55e85659ca784d711dc94a1acebad0"); // Budweiser App - 2.4 Release
		//caps.setCapability("app", "bs://06846d22275da534a7c580226996bf55194ea279"); // Budweiser App-2.3 Release
	
	    
	    driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

	    Thread.sleep(7000);
	    return driver;
	}
	
	public AndroidDriver<AndroidElement> browserStackDevice_Android_Scorz() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("BROWSER_NAME", "Android");
		caps.setCapability("VERSION", "9.0"); 
	    caps.setCapability("device", "Google Pixel 3");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("platformName","Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("unicodeKeyboard", false);
		caps.setCapability("resetKeyboard", false);
		
		caps.setCapability("app", "bs://94ce79c8b00cdf2557253ee93d515e19810ecc77"); // Sales - Jul-Prod-1.8.0
		//caps.setCapability("app", "bs://2be9dd88ac0d1c893959089b05f354de490e4926"); // Sales - Jul -2-Prod-1.7.5
		//caps.setCapability("app", "bs://5b9ab19eecfc089052679447d09ca978b44ffb9a"); // Sales - May - 28 - Prod - 1.7.0
		//caps.setCapability("app", "bs://0cd105fa49d18f02a500a1cf964fbe487782c80b"); //Sales app for testing
		//caps.setCapability("app", "bs://b181d0dd82b8af7659021bf0eae890e8d9331ed5"); // Apr - 29 - Prod - 2.10.0
		//caps.setCapability("app", "bs://8b92818282101df8515301383c64079f27bc807d"); // Apr - 2 - prod - 2.9.2
		//caps.setCapability("app", "bs://614315fdd09e4e07ce18af0a89fd7782b5bb5d8c"); // Feb - 26 - Prod - 2.8.2
		//caps.setCapability("app", "bs://77fe0aa2056de69a0679dd154a43f9d529be180d"); // Feb - 19 - Prod - 2.8.1
		//caps.setCapability("app", "bs://c38f1672efdb201b55aa81a32212b2e98d499304"); // Feb - 1 - Canary - 2.7.3
		//caps.setCapability("app", "bs://697c8dfeed7735d52153eedf12a17a9eddf4c168"); // Jan - 25 - Canary - 2.7.2
		//caps.setCapability("app", "bs://8143fadad1e979e3bfcb408cef508de04d078651"); // Jan - 8 - Canary - 2.6.0
		//caps.setCapability("app", "bs://88cd5ed23e77e6c11f928e49127fbf208d6812fc"); // Dec - 30 - Canary - 2.5.2.2
		//caps.setCapability("app", "bs://1d85a0ee44a19d8cc9d68c4091aed99dd7fd2710"); // Dec - 21 - Canary - 2.5.1
		//caps.setCapability("app", "bs://976f03c3f676ced284d5839ebbae7ba53282c99d"); // Dec - 8 - 2.4 - Canary
		//caps.setCapability("app", "bs://a8a2ce11085010dc236f12493da4ecbc34eee62a"); // Dec-4 - 2.3 - Canary
		//caps.setCapability("app", "bs://8770444bc7a129284644a902306d49afdfa8099f"); // Nov -27 - 2.2.0 - Canary
		//caps.setCapability("app", "bs://d4d96a63e2ce3b169ae87790dd0a73d7a25b2817"); // Nov - 23 -2.1.0 - Canary

	    
	    driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

	    Thread.sleep(7000);
	    return driver;
	}
	public AndroidDriver<AndroidElement> emulatorDevice() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "11"); 
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("automationName", "UiAutomator2");
	
		capabilities.setCapability("app", "/bitrise/src/app-budweiser-releaseV0.0.4.apk");
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(30000);
		return driver;
	}
	
}
