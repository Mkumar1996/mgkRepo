package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.SauceHomePOM;
import com.saucedemo.UtilityPack.UtilityClass1;

//import pack1.SauceHomePOM;



public class TC0002_VreifyBagProductAddtoCartFunctionality extends SauceTestBClass
{

	@Test
	public void verifyBagProAddtoCart() throws IOException
	{
		
		SauceHomePOM sh = new SauceHomePOM(driver);

		
		sh.clickbagProduct();
		log.info("clicked on bag pro.");
		sh.clickAddToCartBtn();
		log.info("clicked on add to cart btn.");
		sh.clickcart();
		


		
		log.info("Apply verification");
		
		String expectedText = "1";
		String actualText = sh.Cart();
		
		UtilityClass1.screenshotMethod(driver, "TC02_bagAddtocart_screenshot");
		log.info("Screenshot taken");
		Assert.assertEquals(actualText, expectedText);
	
	}
			
		
	}
	
	
	
	
	

