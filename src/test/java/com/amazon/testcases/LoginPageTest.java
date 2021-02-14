package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;



public class LoginPageTest extends TestBase{
	LoginPage lp;
	HomePage hp;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		lp = new LoginPage();
	}
	
	@Test(priority=-1)
	public void loginPageTitleTest() {
		String title =lp.validatePageTitle();
		Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=1)
	public void logoTest()
	{
		Boolean b=lp.checkLogo();
		Assert.assertTrue(b, "Logo is displayed");
	}
	
	@Test(priority=0)
	public void loginTest()
	{
		hp =lp.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
