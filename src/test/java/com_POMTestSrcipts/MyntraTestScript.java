package com_POMTestSrcipts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import POMPages.MyntraPage;

public class MyntraTestScript extends BaseClass {
	
	@Test
	public void myntraTestScript() throws Throwable
	{
		capsMethodinsta();
		urlMethod();
		appiumDriver();
		Thread.sleep(5000);
		MyntraPage myntra = new MyntraPage();
		myntra.myntraMethod();
		
	}

}
