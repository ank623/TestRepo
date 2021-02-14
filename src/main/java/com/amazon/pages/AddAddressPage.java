package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class AddAddressPage extends TestBase{

	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement postalCode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement addressLine1;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement addressLine2;
	
	@FindBy(id="address-ui-widgets-landmark")
	WebElement landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;
	
	@FindBy(xpath="//*[@id='address-ui-widgets-enterAddressStateOrRegion']/span/span")
	WebElement state;
	
	@FindBy(xpath="//*[@id='address-ui-widgets-addr-details-address-type-and-business-hours']/span/span")
	WebElement addressType;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement submit;
	
	public AddAddressPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addAddress(String FName, String Mobile,String Pin, String Flat, String Area, String Landmark, String Town)
	{
		name.sendKeys(FName);
		phoneNumber.sendKeys(Mobile);
		postalCode.sendKeys(Pin);
		addressLine1.sendKeys(Flat);
		addressLine2.sendKeys(Area);
		landmark.sendKeys(Landmark);
		city.sendKeys(Town);
		
		
		
	}
}

