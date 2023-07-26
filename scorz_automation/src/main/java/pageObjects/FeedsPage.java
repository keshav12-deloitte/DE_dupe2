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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import utils.Methods;

public class FeedsPage extends Methods{

	Logger log = Logger.getLogger(FeedsPage.class.getName());
	
	public FeedsPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	String _feedsTab = "//android.view.View[starts-with(@content-desc,'Feeds')]";
	String _twitterIcon = "//android.widget.ImageView[@content-desc=\"Tab 2 of 2\"]";
	String _twitterFeed = "(//android.view.View[@index = 0])[9]";
	String _shareButton = "//android.widget.Button[@index = 1]";
	String _settingsTab = "(//android.widget.ImageView[@content-desc='settings'])[2]";
	String _BBLFeed = "//android.widget.ImageView[@content-desc=\"BBL\"]";
	String _NFLFeed = "//android.widget.ImageView[@content-desc=\"NFL\"]";
	String _leagueReOrder = "(//android.view.View[@index = 1])[1]";
	String _ICAFeed = "//android.widget.ImageView[@content-desc=\"ICA\"]";
	String _AFLFeed = "//android.widget.ImageView[@content-desc=\"AUF\"]";
	String _newsFeedHeader = "(//android.widget.ImageView[@index = 1])[2]";
	String _firstnewsFeed = "(//android.widget.ImageView[@index = 1])[2]";
	String _backButtonExclusivePosts = "//android.widget.Button[@index = 0]";
	
	String _likeButton = "//android.view.View[@index = 4]";
	String _commentOption = "//android.widget.EditText[@text = 'Type your comment here...']";
	String _enterCommentIcon = "//android.view.View[@index = 9]";
	String _replytoAComment = "(//android.widget.ImageView[@content-desc=\"Reply\"])[1]";
	String _replyCommentOption = "(//android.widget.EditText[@text = 'Type your comment here...'])[2]";
	String _enterReplyToCommentIcon = "//android.view.View[@index = 15]";
	String _likeToAReplyComment = "//android.view.View[@index = 13]";
	String _likeCount = "//android.view.View[@index = 2]";
	String _commentCount = "//android.view.View[@index = 3]";
	String _shareOption = "//android.view.View[@index = 5]";
	
	String _breakingNewsTab = "//android.view.View[@index = 3]";
	String _exclusivePostsTab = "//android.view.View[@index = 3]";
	String _twitterFeedTab = "//android.view.View[starts-with(@content-desc,'Twitter')]";
	String _likeNews = "//android.widget.Button[@index = 1]";
	String _shareNews = "(//android.widget.ImageView[@index = 2])[2]";
	String _MLBNewsFeed = "//android.widget.ImageView[@content-desc = 'MLB']";
	
	String _MLBMatches = "(//android.widget.ImageView[@index = 1])[1]";
	String _NHLMatches = "(//android.widget.ImageView[@index = 0])[1]";
	String _skipButton = "//android.view.View[@content-desc = 'Skip']";
	
	String _youtubeTab = "//android.view.View[starts-with(@content-desc,'Youtube')]";
	String _NHLWatchThisSection = "//android.view.View[starts-with(@content-desc,'Watch This!')]";
	String _MLB2021GameHighlights = "//android.view.View[starts-with(@content-desc,'2021 Game')]";
	String _MLBVideoLink = "(//android.widget.ImageView[@index = 1])[2]";
	String _videoPlayButton = "(//android.widget.Button[@index = 1])";
	
	Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();
	
	public boolean breakingNews(ExtentTest test) {
		try {
			
			log.info("Breaking News for all the leagues");
			this.elementClick(_feedsTab, "xpath", test);
			Wait();
			this.elementClick(_breakingNewsTab, "xpath", test);
			Wait();
			this.elementClick(_likeNews, "xpath", test);
			Wait();
			this.elementClick(_shareNews, "xpath", test);
			Wait();
			this.backbuttonKeyEvent(test);
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			this.elementClick(_MLBNewsFeed, "xpath", test);
			Wait();
			this.elementClick(_likeNews, "xpath", test);
			Wait();
			this.elementClick(_shareNews, "xpath", test);
			Wait();
			this.backbuttonKeyEvent(test);
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			return true;
			
		} catch (Exception e) {
			log.info("Breaking News - Failed with Exception");
			return false;
		}
	}
	
	public boolean newsFeed(ExtentTest test) {
		try {
			log.info("Exclusive Posts - News Feed");
			this.elementClick(_feedsTab, "xpath", test);
			Wait();
			Wait();
			this.elementClick(_newsFeedHeader, "xpath", test);
			Wait();
			Wait();
			this.elementClick(_firstnewsFeed, "xpath", test);
			this.scrollDown(test);
			this.scrollDown(test);
			Wait();
			this.scrollUp(test);
			this.scrollUp(test);
			this.elementClick(_backButtonExclusivePosts, "xpath", test);
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			Wait();
			return true;
		} catch (Exception e) {
			log.info("Exclusive posts - Failed with Exception");
			return false;
		}
	}
	
	public boolean twitterFeed(ExtentTest test) {
		
		try {
			log.info("Twitter Feeds");
			Wait();
			Wait();
			this.elementClick(_twitterFeedTab, "xpath", test);
			Wait();
			this.elementClick(_MLBMatches, "xpath", test);
			Wait();
			TouchAction action = new TouchAction(driver);
			
			action.tap(new PointOption().withCoordinates(width/2, 600)).perform();
			
			//this.elementClick(_twitterFeed, "xpath", test);
			Wait();
			Wait();
			Wait();
			Thread.sleep(10000);
			this.backbuttonKeyEvent(test);
			Wait();
			Wait();
			Wait();
			this.elementClick(_shareButton, "xpath", test);
			Wait();
			Wait();
			this.backbuttonKeyEvent(test);
			Wait();
			this.scrollUp(test);
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			this.elementClick(_NHLMatches, "xpath", test);
			this.scrollDown(test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean twitterFeedForNFL(ExtentTest test) {
		
		try {
			log.info("Twitter Feeds");
			Thread.sleep(5000);
			this.elementClick(_feedsTab, "xpath", test);
			Wait();
			Wait();
			this.elementClick(_NFLFeed, "xpath", test);
			Wait();
			TouchAction action = new TouchAction(driver);
			
			action.tap(new PointOption().withCoordinates(width/2, 600)).perform();
			
			//this.elementClick(_twitterFeed, "xpath", test);
			Wait();
			Wait();
			Wait();
			Thread.sleep(10000);
			this.backbuttonKeyEvent(test);
			Wait();
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			this.scrollDown(test);
			Wait();
			this.elementClick(_settingsTab, "xpath", test);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean socialFeature(ExtentTest test) {
		
		try {
			log.info("Like, Comment and Share Options in the exclusive posts");
			Wait();
//			this.elementClick(_skipButton, "xpath", test);
//			Wait();
			this.elementClick(_feedsTab, "xpath", test);
			Wait();
			this.elementClick(_exclusivePostsTab, "xpath", test);
			Wait();
			this.elementClick(_firstnewsFeed, "xpath", test);
			this.scrollDown(test);
			this.scrollDown(test);
//			this.elementClick(_likeButton, "xpath", test);
//			Wait();
//			String likeCount = driver.findElement(By.xpath(_likeCount)).getAttribute("content-desc");
//			if ( !likeCount.isEmpty() && likeCount != null) {
//				log.info("Like Count is displayed");
//			}
			/*this.sendKeys(_commentOption, "xpath", "Test Comment for an exclusive post", test);
			
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			
			this.elementClick(_enterCommentIcon, "xpath", test);
			Wait();
			this.scrollDown(test);
			this.elementClick(_replytoAComment, "xpath", test);
			Wait();
			this.sendKeys(_replyCommentOption, "xpath", "Reply Comment to an exclusive post", test);
			
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.T));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.R));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.P));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.Y));
			
			this.elementClick(_enterReplyToCommentIcon, "xpath", test);*/
			//this.elementClick(_likeToAReplyComment, "xpath", test);
			
//			String commentCount = driver.findElement(By.xpath(_commentCount)).getAttribute("content-desc");
//			if ( !commentCount.isEmpty() && commentCount != null) {
//				log.info("Comment Count is displayed");
//			}
//			this.elementClick(_shareOption, "xpath", test);
//			Wait();
//			this.backbuttonKeyEvent(test);
			Wait();
			this.scrollUp(test);
			this.scrollUp(test);
			this.scrollUp(test);
			this.scrollUp(test);
			this.elementClick(_backButtonExclusivePosts, "xpath", test);
			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean youtubeFeeds(ExtentTest test) {
		
		try {
			log.info("Youtube Feeds");
			Wait();
			this.elementClick(_NHLMatches, "xpath", test);
			Wait();
			Wait();
			this.elementClick(_youtubeTab, "xpath", test);
			Wait();
			Wait();
			this.elementClick(_NHLWatchThisSection, "xpath", test);
			Wait();
			this.scrollDown(test);
			this.scrollDown(test);
			this.elementClick(_MLBMatches, "xpath", test);
			Wait();
			Wait();
			Wait();
			this.elementClick(_MLB2021GameHighlights, "xpath", test);
			Wait();
			Wait();
			this.scrollUp(test);
			Wait();
			this.elementClick(_MLBVideoLink, "xpath", test);
			Wait();
			Wait();
			Wait();
//			this.elementClick(_videoPlayButton, "xpath", test);
//			Wait();
//			Wait();
//			Wait();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
