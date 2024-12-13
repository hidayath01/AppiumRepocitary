package EmulatorClasses;



import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class OrangeHRMGeneral {

	@Test
	public void orangeMethod()
	{
		try {
		DesiredCapabilities caps = new DesiredCapabilities();  
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("platformVersion", "15");
		caps.setCapability("deviceName", "Medium Phone API 35");
		caps.setCapability("automationName", "UIAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");            
		caps.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url,caps);
		Thread.sleep(15000);
		driver.findElement(By.id("com.android.chrome:id/signin_fre_continue_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.chrome:id/button_primary")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.chrome:id/ack_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.id("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.chrome:id/omnibox_suggestions_dropdown\"]/android.view.ViewGroup[7]/android.widget.ImageView[1]")).click();
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.EditText"));
		userName.clear();
		userName.sendKeys("Admin");
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.EditText"));
		password.clear();
		password.sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.Button")).click();
		
		
		
		Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void newClassAutoIT() throws Throwable
	{
		//write the script in SCIte from the program file u can open it
		// save it in required place
		// give the path in the scite scripte nly given....ControlGetFocus("Open","","Edit1")
//		Sleep(3000)
//		ControlSetText("Open","Edit1","Downloads\sslc.jpg")
//		Sleep(3000)
//		ControlClick("Open","","Button1")
//		WebDriver driver = new EdgeDriver();
		//driver.get("");//provide the url where the file should be uploaded
		//find the upload element using selenium
		Runtime.getRuntime().exec("");//provide the location of upload file(from local system)
		
		//provide the  sleep if required
	}

}
