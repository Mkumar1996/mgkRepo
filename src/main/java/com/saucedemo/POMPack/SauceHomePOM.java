package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceHomePOM 
{
WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement SettingBtn;
	
	public void clickSettingBtn()
	{
		SettingBtn.click();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutBtn;
	
	public void clicklogoutBtn()
	{
		Actions act = new Actions(driver);
		act.moveToElement(logoutBtn);
//		logoutBtn.click();
	}
	
	@FindBy (xpath= "//div[text()='Sauce Labs Backpack']")
	private WebElement bagProduct;
	
	public void clickbagProduct()
	{
		bagProduct.click();
	}
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addToCartBtn;
	
	public void clickAddToCartBtn()
	{
		addToCartBtn.click();	
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement cart;
	
	public String Cart()
	{
		return cart.getText();
	}
	
	public void clickcart()
	{
		cart.click();
	}
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement>AllPrdAddToCart;
	
	public void multiPrdAddToCart()
	{
		for (WebElement j : AllPrdAddToCart) 
		{
			j.click();
		}
	}
	
	public SauceHomePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
