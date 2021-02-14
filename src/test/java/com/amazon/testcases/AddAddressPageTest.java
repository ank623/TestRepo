package com.amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.AddAddressPage;
import com.amazon.pages.EditProfilePage;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.ProfilePage;
import com.amazon.util.TestUtil;

public class AddAddressPageTest extends TestBase{

	LoginPage lp;
	HomePage hp;
	ProfilePage pp;
	EditProfilePage epp;
	AddAddressPage aap;
	
	String sheetName = "Address";
	
	public AddAddressPageTest()
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
	    aap=pp.addAddresslink();
	}
	
	@DataProvider
	public Object[][] getAmazonTestData()
	{
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(dataProvider="getAmazonTestData")
	public void addressadding(String FullName, String MobileNo, String PinCode, String Flat, String Area, String Landmark, String Town)
	{
		aap.addAddress(FullName, MobileNo, PinCode, Flat, Area, Landmark, Town);
	}
	
	

}
