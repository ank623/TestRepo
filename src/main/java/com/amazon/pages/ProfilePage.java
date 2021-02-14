package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class ProfilePage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Edit addresses')]")
	WebElement address;
	
	@FindBy(id="ya-myab-address-edit-btn-4")
	WebElement editAddress;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(xpath="//h2[contains(text(),'Add address')]")
	WebElement addAddress;
	
	public ProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public EditProfilePage AddressEdit()
	{
		address.click();
		editAddress.click();
		
		return new EditProfilePage();
	}
	
	public AddAddressPage addAddresslink()
	{
		address.click();
		addAddress.click();
		return new AddAddressPage();
	}
	
	
}
