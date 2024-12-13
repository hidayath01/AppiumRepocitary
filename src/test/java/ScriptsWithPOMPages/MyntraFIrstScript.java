package ScriptsWithPOMPages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import POMPages.MyntraApplicationPge;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MyntraFIrstScript extends BaseClass {
	@Test
	public void myntraFirstScriptMethod() throws Throwable
	{
		
		connectDriver();
		waitMethod();
		MyntraApplicationPge myntra = new MyntraApplicationPge();
	}
		
}
