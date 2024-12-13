package com_POMTestSrcipts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import POMPages.InstagramPage;

public class InstagramTestScriptFirst extends BaseClass {
	@Test
	public void instagramTestMethod() throws Throwable
	{
		
		capsMethodinsta();
		urlMethod();
		appiumDriver();
		Thread.sleep(5000);
		InstagramPage inspage = new InstagramPage();
		inspage.instagramPageMethod();
	}

}
