package com.appiumtest.testcases;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExecutionTest 
{
	
	public static void main(String [] Args) throws Throwable
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");            
		caps.setCapability("platformVersion", "13");
            	caps.setCapability("deviceName", "Oppo F19Pro+");            
		caps.setCapability("automationName", "UIAutomator2");            				
		caps.setCapability("appPackage", "com.coloros.calculator");            
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");            
		caps.setCapability("udid", "USUO8TUKIFSCK78P");
		caps.setCapability("ignoreHiddenApiPolicyError", "true");
		caps.setCapability("noReset", "true");
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AppiumDriver driver = new AndroidDriver(url,caps);
			Thread.sleep(5000);
			driver.findElement(By.id("com.coloros.calculator:id/img_clr")).click();
			WebElement two = driver.findElement(By.id("com.coloros.calculator:id/digit_2"));
			two.click();
			driver.findElement(By.id("com.coloros.calculator:id/img_op_add")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_clr")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_1")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_op_mul")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_9")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_clr")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_8")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_op_mul")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_7")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_clr")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_4")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_op_mul")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_5")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_clr")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_6")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_op_mul")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_3")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_clr")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_9")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_op_div")).click();
			driver.findElement(By.id("com.coloros.calculator:id/digit_6")).click();
			driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
			
			WebElement seven = driver.findElement(By.id("com.coloros.calculator:id/digit_7"));
			seven.click();
			WebElement three = driver.findElement(By.id("com.coloros.calculator:id/digit_3"));
			three.click();
			driver.findElement(By.id("com.coloros.calculator:id/result")).click();
			WebElement results = driver.findElement(By.id("com.coloros.calculator:id/result"));
			if(results.equals(10));
			{
				System.out.println("Test Passed...");
			}
	}
	
}
