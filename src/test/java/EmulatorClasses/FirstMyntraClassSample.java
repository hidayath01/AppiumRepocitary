package EmulatorClasses;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import com.google.common.io.Files;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
public class FirstMyntraClassSample
{
	@Test
	public void myntraMethod() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");            
		caps.setCapability("platformVersion", "13");
        caps.setCapability("deviceName", "Medium Phone API 13");            
		caps.setCapability("automationName", "UIAutomator2");            				
		caps.setCapability("appPackage", "com.myntra.android");            
		caps.setCapability("appActivity", "com.myntra.android.activities.ProfileSettingsActivity");            
		caps.setCapability("udid", "emulator-5556");
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AppiumDriver driver = new AndroidDriver(url,caps);
		//C:\Users\Qapitol QA\AppData\Local\Android\Sdk\emulator	
			
	}
	@Test
	public void emulatorSetup() throws MalformedURLException, URISyntaxException, InterruptedException, Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.myntra.android");
		caps.setCapability("appActivity", "com.myntra.android.activities.react.ReactActivity");
		
		
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.myntra.android:id/askPermission\"]")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"BANNER_2\"]/android.widget.ImageView")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"TOPNAV_CAROUSEL_1_4\"])[2]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[1]/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"size_select_L\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"buy_done_button\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add to Bag\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"size_select_XL\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"DONE\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Go to Bag\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.View[@resource-id=\"cartItemsList\"]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[4]")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"mobile\"]")).sendKeys("9480895534");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"form-button\"]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SHOPPING BAG\"]/android.view.View/android.view.View/android.view.View/android.view.View[11]/android.view.View[2]")).click();
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./src/test/resources/SreenShots");
	    try {
            Files.copy(source, destination);
            System.out.println("Screenshot taken and saved at: " + destination);
        } catch (Exception e) {
            e.printStackTrace();
        }
				
	}
	@Test
	public void redBus() throws Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.app.abhibus");            
		caps.setCapability("appActivity", "com.spotify.sdk.android.auth.LoginActivity");    
		caps.setCapability("autoGrantPermission", true);
		caps.setCapability("noReset", false);
		
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AppiumDriver driver = new AndroidDriver(url,caps);
			
			
			
	}
	@Test
	public void instagrammeScript() throws Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.instagram.android");            
		caps.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url,caps);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\"android:id/content\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]/android.view.ViewGroup")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.instagram.android:id/tab_icon\"])[4]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_selected_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Cancel\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.instagram.android:id/quick_capture_top_shadow_overlay")).click();
		Thread.sleep(10000);
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./src/test/resources/SreenShots");
	    try {
            Files.copy(source, destination);
            System.out.println("Screenshot taken and saved at: " + destination);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
}
