package GenericUtilities;


import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass implements IPConstants{
	
	public WebDriver driver;
	public AppiumDriver drive;
	public AppiumDriver drivering;
	public URL url;
	public DesiredCapabilities caps;
	public DesiredCapabilities cap;
	public void connectDriver()
	{
		driver=new EdgeDriver();
	}
	public void appium()
	{
		drivering = new AndroidDriver(cap);
	}
	
	
	public void waitMethod()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void capsMethodinsta()
	{
		caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.instagram.android");            
		caps.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity"); 
	}
	
	
	public void capsMethodMyntra()
	{
		caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.myntra.android");
		caps.setCapability("appActivity", "com.myntra.android.activities.react.ReactActivity"); 
	}
	public void appiumDriver()
	{
		drive = new AndroidDriver(url,caps) ;
	}
	
	public void urlMethod() throws Throwable
	{
		url = new URL("http://127.0.0.1:4723/wd/hub");
	}
	
	public void capsMethodOrangeHRM() throws Throwable
	{
	    cap = new DesiredCapabilities();  
		cap.setCapability("platformName", "ANDROID"); 
		cap.setCapability("platformVersion", "15");
		cap.setCapability("deviceName", "Medium Phone API 35");
		cap.setCapability("automationName", "UIAutomator2");
		cap.setCapability("appPackage", "com.android.chrome");            
		cap.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
	}	
	
	
	
	public void swipeUp() 
	{
		Dimension size = driver.manage().window().getSize();
		int startX = size.width / 2;
		int startY = (int) (size.height * 0.8); // Bottom
		int endY = (int) (size.height * 0.2);  // Top

		// Swipe up
		swipeUp();
	}
	
	
	
	
	public String screenShotMethod(String name)
    {
    	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
    		String	targetFilePath = System.getProperty("user.dir")+"\\screanshots\\"+"-"+timeStamp+".png";
    		File targetFile = new File(targetFilePath);
    		sourceFile.renameTo(targetFile);
    		
    		return targetFilePath;
    					
    }
	
}
