package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.ElectronicsPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;

public class ElectronicsPageTest extends TestBase{

	LoginPage lp;
	HomePage hp;
	ElectronicsPage ep;
	
	public ElectronicsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		lp= new LoginPage();
		ep = new ElectronicsPage();
		hp =lp.login(prop.getProperty("email"), prop.getProperty("password"));
	
	 ep =hp.electronicLinkCheck();
	}
	
	@Test(priority=2)
	public void verifyLabelTest()
	{
		boolean b= ep.verifyLabel();
		Assert.assertTrue(b, "Label is displayed");
	}
	
	@Test(priority=1)
	public void clickCheckboxTest()
	{
		ep.checkboxClick();
	}
	
	@Test(priority=-1)
	public void dropdownSelectTest()
	{
		ep.dropdownSelect(prop.getProperty("SearchValue"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
