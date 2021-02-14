package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Hello, ankit')]")
	WebElement UsernameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement CartLink;
	
	@FindBy(xpath="//a[contains(text(),'Electronics')]")
	WebElement ElectronicsLink;
	
	@FindBy(xpath="//span[contains(text(),'Your Account')]")
	WebElement profile;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean labelCheck()
	{
		return UsernameLabel.isDisplayed();
	}
	
	public DealsPage dealsLinkCheck()
	{
		DealsLink.click();
		return new DealsPage();
	}
	
	public ElectronicsPage electronicLinkCheck()
	{
		ElectronicsLink.click();
		return new ElectronicsPage();
	}
	
	public CartPage cartLinkCheck()
	{
		CartLink.click();
		return new CartPage();
		
	}
	
	public ProfilePage profilelink()
	{
		Actions action = new Actions(driver);
		action.moveToElement(UsernameLabel).build().perform();
		profile.click();
		return new ProfilePage();
	}
	
}
