package pageObjects;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;

public class MatchDay extends Methods{

	Logger log = Logger.getLogger(CouponsPage.class.getName());
	TouchAction touchAction = new TouchAction(driver);
	
	String _matchDayTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]";
	String _MLBMatches = "(//android.widget.ImageView[@index = 1])[1]";
	String _NHLMatches = "(//android.widget.ImageView[@index = 0])[1]";
	String _NFLMatches = "//android.widget.ImageView[@content-desc = 'NFL']";
	String _NBAMatches = "(//android.widget.ImageView[@index = 4])";
	String _calender = "//android.widget.ImageView[@content-desc = 'Schedule']";
	String _profileTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]";
	String _leaderBoard = "(//android.widget.ImageView[starts-with(@content-desc,'NFL')])[2]";
	String _gameStatsTile = "//android.view.View[starts-with(@content-desc,'GB')]";
	String _gameStatsText = "//android.view.View[starts-with(@content-desc,'GB')]";
	String _gameDayLeaderboard ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[4]";
	String _leagueReOrder = "(//android.widget.ImageView[@index = 1])[2]";
	String _ICAFeed = "//android.widget.ImageView[@content-desc=\"ICA\"]";
	String _AFLFeed = "//android.widget.ImageView[@content-desc=\"AUF\"]";
	String _FeedsTab = "//android.view.View[starts-with(@content-desc,'Feeds')]";
	String _gameDayTab = "//android.view.View[starts-with(@content-desc,'Game Day')]";
	String _BBLFeed = "//android.widget.ImageView[@content-desc=\"BBL\"]";
	
	String _schedule = "//android.view.View[@content-desc='SCHEDULE']";
	String _news = "//android.view.View[@content-desc='NEWS']";
	String _standings = "//android.view.View[@content-desc='STANDINGS']";
	String _firstNews = "//android.view.View[@index = 1]";
	String _likeButton = "//android.view.View[@index = 3]";
	String _shareButton = "//android.view.View[@index = 4]";
	String _skipButton = "//android.view.View[@content-desc = 'Skip']";
	String _gameDetail = "(//android.view.View[@index = 0])[7]";
	String _stadiumEventsTab = "//android.view.View[@content-desc=\"EVENTS\"]";
	String _stadiumEvent = "(//android.widget.ImageView[@index = 1])[3]";
	String _stadiumEventLink = "(//android.view.View[@index = 5])";
	String _stadiumEventClose = "//android.view.View[@content-desc=\"CLOSE\"]";
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	public MatchDay(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	public boolean matchDay(ExtentTest test) {
		try {

			Thread.sleep(5000);
			this.scrollLeft(test);
			Thread.sleep(2000);
			this.scrollLeft(test);
			Thread.sleep(5000);
			this.scrollUp(test);
			Thread.sleep(3000);
			this.scrollRight(test);
			Thread.sleep(2000);
			this.scrollDown(test);
			Wait();
			
			this.elementClick(_MLBMatches, "xpath", test);
			Wait();
			
			this.scrollLeft(test);
			Thread.sleep(2000);
			this.scrollDown(test);
			Thread.sleep(5000);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean matchDay_Scorz(ExtentTest test) {
		try {
			log.info("Checking the Game Day across the leagues");
			Wait();
//			this.elementClick(_skipButton, "xpath", test);
//			Wait();
			
			this.elementClick(_NHLMatches, "xpath", test);
			Thread.sleep(3000);
			this.scrollLeft(test);
			this.scrollLeft(test);
			Thread.sleep(3000);
			this.scrollUp(test);
			Thread.sleep(3000);
			
			this.elementClick(_MLBMatches, "xpath", test);
			Thread.sleep(3000);
			this.scrollLeft(test);
			Thread.sleep(2000);
			this.scrollLeft(test);
			Thread.sleep(5000);
			this.scrollUp(test);
			Thread.sleep(3000);
			this.scrollDown(test);
			Wait();
			this.scrollUp(test);
			Wait();
			
			
			this.elementClick(_leagueReOrder, "xpath", test);
			Wait();
			
			WebElement we = driver.findElement(By.xpath(_AFLFeed));
			
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(width/2, height/2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).moveTo(new ElementOption().withElement(we)).perform();
			
			Wait();
			action.tap(new PointOption().withCoordinates(100, 100)).perform();
			Wait();
			this.elementClick(_gameDetail, "xpath", test);
			Wait();
			touchAction.tap(new PointOption().withCoordinates(60, 140)).perform();
			Wait();
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean leaderBoard(ExtentTest test) {
		try {
			log.info("Leader board and Game stats");
			Wait();
//			this.elementClick(_MLBMatches, "xpath", test);
//			Wait();
			Wait();
			this.elementClick(_news, "xpath", test);
			Wait();
			this.elementClick(_firstNews, "xpath", test);
			Wait();
			Wait();
			/*this.scrollDown(test);
			this.scrollDown(test);
			this.scrollDown(test);
			this.scrollDown(test);
			this.scrollDown(test);
			this.scrollDown(test);
			this.elementClick(_likeButton, "xpath", test);
			Wait();
			wait();
			this.elementClick(_shareButton, "xpath", test);
			Wait();
			this.backbuttonKeyEvent(test);
			this.scrollUp(test);
			this.scrollUp(test);
			this.scrollUp(test);
			this.scrollUp(test);
			this.scrollUp(test);
			this.scrollUp(test);*/
			touchAction.tap(new PointOption().withCoordinates(60, 140)).perform();
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			Wait();
			this.elementClick(_NHLMatches, "xpath", test);
			Wait();
			Wait();
			this.elementClick(_standings, "xpath", test);
			Wait();
			this.scrollDown(test);
			Wait();
			this.scrollRight(test);
			Wait();
			this.scrollDown(test);
			Wait();
			Wait();
			/*Wait();
			touchAction.tap(new PointOption().withCoordinates(60, 140)).perform();
			Wait();
			Wait();
			this.scrollLeft(test);
			Wait();
			this.scrollLeft(test);
			Wait();
			Wait();
			this.elementClick(_gameStatsTile, "xpath", test);
			Wait();
			String goalPoints = driver.findElement(By.xpath(_gameStatsText)).getText();
			if ( !goalPoints.isEmpty() && goalPoints != null) {
				log.info("Game Details are displayed");
			}
			this.scrollRight(test);
			Wait();*/
			
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean stadiumEvents(ExtentTest test) {
		try {
			log.info("Stadium Events");
			Wait();
			this.elementClick(_stadiumEventsTab, "xpath", test);
			Wait();
			this.elementClick(_stadiumEvent, "xpath", test);
			Wait();
			this.elementClick(_stadiumEventLink, "xpath", test);
			Wait();
			Wait();
			touchAction.tap(new PointOption().withCoordinates(60, 140)).perform();
			Wait();
			this.elementClick(_stadiumEventClose, "xpath", test);
			Wait();
			this.scrollUp(test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
