package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass1 
{
	public static void screenshotMethod(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourceflie = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Administrator\\Downloads\\Mahesh Whatsup Download\\Automation Screenshots\\"+ name +".jpg");
		
		FileHandler.copy(sourceflie, destfile);
		
	}
	
	
	
	
}
