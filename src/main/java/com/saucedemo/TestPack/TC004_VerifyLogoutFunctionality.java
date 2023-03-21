package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.UtilityPack.UtilityClass1;

//import pack1.SauceHomePOM;

public class TC004_VerifyLogoutFunctionality extends SauceTestBClass
{
	@Test
	public void verifyLogout() throws IOException
	{

	
		log.info("Verification applied");
		
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
	
		Assert.assertEquals(actualTitle, expectedTitle);
		
		UtilityClass1.screenshotMethod(driver, "TC04_Logout_screenshot");
		log.info("Screenshot taken");
	
		
		
	}
	
	
	
	
	
}
