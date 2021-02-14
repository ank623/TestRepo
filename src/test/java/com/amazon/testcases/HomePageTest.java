package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.CartPage;
import com.amazon.pages.DealsPage;
import com.amazon.pages.ElectronicsPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;



public class HomePageTest extends TestBase{

	LoginPage lp;
	HomePage hp;
	DealsPage dp;
	ElectronicsPage ep;
	CartPage cp;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		lp= new LoginPage();
	    hp= lp.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test
	public void dealsPageTest()
	{
		dp =hp.dealsLinkCheck();		
	}
	
	@Test
	public void electronicsLink()
	{
		ep =hp.electronicLinkCheck();		
	}
	
	@Test
	public void cartLinkCheck()
	{
		cp =hp.cartLinkCheck();
	}
	
	@Test
	public void labelTest()
	{
		boolean b= hp.labelCheck();
	Assert.assertTrue(b, "Label is displayed");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
