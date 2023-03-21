package com.saucedemo.TestPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.saucedemo.UtilityPack.UtilityClass1;

public class TC0001_VerifyloginFunctionality extends SauceTestBClass
{	

	@Test
	public void verifylogin() throws IOException
	{
		log.info("verification applied");
	
		String expectedTitle = "Swag Labs" ;
		String actualTitle = driver.getTitle();
		
	Assert.assertEquals(actualTitle, expectedTitle);	
		
		
	UtilityClass1.screenshotMethod(driver, "TC01_Homepage_pageScreenshot ");
	log.info("screenshot taken");
	
	
	}
	
}
