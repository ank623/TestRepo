package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.CartPage;
import com.amazon.pages.DealsPage;
import com.amazon.pages.ElectronicsPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.ProfilePage;

public class ProfilePageTest extends TestBase{

	
	LoginPage lp;
	HomePage hp;
	ProfilePage pp;
	
	
	
	public ProfilePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		lp= new LoginPage();
	    hp= lp.login(prop.getProperty("email"), prop.getProperty("password"));
	    pp= hp.profilelink();
	}
	
	@Test
	public void editAddressTest()
	{
		pp.AddressEdit();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
