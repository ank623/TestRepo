package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class ElectronicsPage extends TestBase{

	
	@FindBy(xpath="//img[@class='nav-categ-image']")
	WebElement elecLabel;
	
	@FindBy(xpath="//span[contains(text(),'Boat')]")
	WebElement checkbox;
	
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement dropdown;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement submitButton;
	
	public ElectronicsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLabel()
	{
		return elecLabel.isDisplayed();
	}
	
	public void checkboxClick()
	{
		checkbox.click();
	}
	
	public void dropdownSelect(String Value)
	{
		Select s = new Select(dropdown);
		s.selectByVisibleText("Books");
		searchBox.sendKeys(Value);
		submitButton.click();		
		
	}
}
