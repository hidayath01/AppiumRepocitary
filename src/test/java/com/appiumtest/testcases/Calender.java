package com.appiumtest.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Calender 
{
	
	@Test
	public void calenderProgram() throws MalformedURLException, Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");            
		caps.setCapability("platformVersion", "13");
            	caps.setCapability("deviceName", "Oppo F19Pro+");            
		caps.setCapability("automationName", "UIAutomator2");            				
		caps.setCapability("appPackage", "com.google.android.calendar");            
		caps.setCapability("appActivity", "com.android.calendar.AllInOneActivity");            
		caps.setCapability("udid", "USUO8TUKIFSCK78P");
		caps.setCapability("ignoreHiddenApiPolicyError", "true");
		caps.setCapability("noReset", "true");
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AppiumDriver driver = new AndroidDriver(url,caps);
			Thread.sleep(5000);
			driver.findElement(By.id("new UiSelector().text(\"Calendar\")")).click();
			driver.findElement(By.id("new UiSelector().text(\"Calendar\")")).click();
		
	}
}
