package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.SauceHomePOM;
import com.saucedemo.UtilityPack.UtilityClass1;

//import pack1.SauceHomePOM;

public class TC003_VerifyAllProAddtoCartFunctionality extends SauceTestBClass
{

	@Test
	public void verifyAllProAddtoCart() throws IOException
	{
		SauceHomePOM sh = new SauceHomePOM(driver);
		sh.multiPrdAddToCart();
		sh.clickcart();
		
		log.info("Verification applied");
		
		String expectedText = "6";
		String actualText = sh.Cart();
		UtilityClass1.screenshotMethod(driver, "TC03_AllproAddtocart_screenshot");
		log.info("Screenshot taken");
		Assert.assertEquals(actualText, expectedText);
		
	}
	
	
	
}
