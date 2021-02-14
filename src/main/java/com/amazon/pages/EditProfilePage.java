package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class EditProfilePage extends TestBase{

	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement Area;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement submit;

	@FindBy(xpath="//*[@id='address-ui-widgets-addr-details-address-type-and-business-hours']/span/span")
	WebElement addressType;

	@FindBy(id="address-ui-widgets-landmark")
	WebElement landmark;
	
public EditProfilePage()
{
	PageFactory.initElements(driver, this);
}

public void enterValues(String na, String phone, String Landmark)
{
	name.clear();
	name.sendKeys(na);
	phoneNumber.clear();
	phoneNumber.sendKeys(phone);
	landmark.clear();
	landmark.sendKeys(Landmark);
	
	submit.click();
}


}