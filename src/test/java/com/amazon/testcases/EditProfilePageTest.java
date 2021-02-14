package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.EditProfilePage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.ProfilePage;

public class EditProfilePageTest extends TestBase{

	LoginPage lp;
	HomePage hp;
	ProfilePage pp;
	EditProfilePage epp;
	
	
	
	public EditProfilePageTest()
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
	    epp=pp.AddressEdit();
	}
	
	@Test
	public void enterValuesTest()
	{
		epp.enterValues(prop.getProperty("name"), prop.getProperty("mobile"), prop.getProperty("Landmark"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
