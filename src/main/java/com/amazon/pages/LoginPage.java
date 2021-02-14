package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class LoginPage extends TestBase{

	//Page factory -OR-: 
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement LoginBtn;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(id="continue")
	WebElement ContinueBtn;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement SubmitBtn;
	
	@FindBy(id="createAccountSubmit")
	WebElement RegisterBtn;
	
	@FindBy(id="auth-fpp-link-bottom")
	WebElement ForgotPassword;
	
	@FindBy(linkText="Conditions of Use")
	WebElement ConditionLink;
	
	@FindBy(id="nav-logo-sprites")
	WebElement Logo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String email, String password)
	{
		LoginBtn.click();
		Email.sendKeys(email);
		ContinueBtn.click();
		Password.sendKeys(password);
		SubmitBtn.click();
		
	return new HomePage();
	}
	
	public boolean checkLogo()

	{
		return Logo.isDisplayed();
	}
}
