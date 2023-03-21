package com.saucedemo.TestPack;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.saucedemo.POMPack.SauceHomePOM;
import com.saucedemo.POMPack.SauceLoginPOMClass;



public class SauceTestBClass 
{	
	
	WebDriver driver;
	Logger log = Logger.getLogger("Mahesh123");
	
	
	@Parameters("browserName")
	 
	 @BeforeMethod
	public void  browserlaunch(String browserName)
	{
		
		if(browserName.equals("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\Mahesh Whatsup Download\\Zip selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("gecko"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\Mahesh Whatsup Download\\Zip selenium\\geckodriver-v0.32.0-win32");
		driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Administrator\\Downloads\\Mahesh Whatsup Download\\Zip selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser is opened");
		
		
//		
		
		
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");

	
		driver.manage().window().maximize();
		log.info("browser is maximized");
		System.out.println("Browser maximized");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("wait applied");
		
		
		
		SauceLoginPOMClass lp = new SauceLoginPOMClass(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clikLoginBtn();
		}

		
	@AfterMethod
	public void logout()
	{
		SauceHomePOM sh = new SauceHomePOM(driver);	
	sh.clickSettingBtn();
	sh.clicklogoutBtn();
	driver.quit();
		
		System.out.println("Browser closed");
		System.out.println("End of program");
	}
	
	
	
	
}
