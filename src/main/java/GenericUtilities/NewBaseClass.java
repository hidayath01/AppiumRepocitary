package GenericUtilities;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.AndroidDriver;


public class NewBaseClass {
	
	public DesiredCapabilities caps;
	public URL url;
	public AppiumDriver driver;
	
	public void urlMethod() throws Throwable
	{
		url = new URL("http://127.0.0.1:4723/wd/hub");
	}
	public void capsMethod()
	{
		caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");            
		caps.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
	}
	public void appiumMethod()
	{
		driver = new AppiumDriver(url,caps);
	}
	
	public void enterDataMethod()
	{
//		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

}
