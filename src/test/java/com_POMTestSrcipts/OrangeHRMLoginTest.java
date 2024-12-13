package com_POMTestSrcipts;

import org.testng.annotations.Test;

import GenericUtilities.IPConstants;
import GenericUtilities.NewBaseClass;
import POMPages.OrangeHRMLoginPage;

public class OrangeHRMLoginTest extends NewBaseClass implements IPConstants{
	
	@Test
	public void orangeMethod() throws Throwable
	{
		capsMethod();
		urlMethod();
		appiumMethod();
		OrangeHRMLoginPage page = new OrangeHRMLoginPage(driver);
		page.loginMethod(Ourl, username, password);
	}

}
