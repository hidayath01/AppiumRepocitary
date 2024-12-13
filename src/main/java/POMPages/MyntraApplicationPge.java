package POMPages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MyntraApplicationPge extends BaseClass{
	
	public MyntraApplicationPge()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.myntra.android:id/askPermission\"]")
	public WebElement askPermission;
	@FindBy(xpath = "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement MensStore;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BANNER_2\"]/android.widget.ImageView")
	public WebElement popupButton;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
	public WebElement allowButton;
	
	public void firstMethod() throws Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.myntra.android");
		caps.setCapability("appActivity", "com.myntra.android.activities.react.ReactActivity");

		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		Thread.sleep(10000);
		askPermission.click();
		MensStore.click();
		popupButton.click();
		allowButton.click();
		
	}
}
