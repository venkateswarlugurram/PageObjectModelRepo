package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.cps.base.CPSBankingURL;
import Com.cps.pages.HeadBranchLoginPage;

public class HeadBranchLoginTest extends CPSBankingURL{

	HeadBranchLoginPage hLogin;
	public HeadBranchLoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		
		 hLogin=new HeadBranchLoginPage();
	}
	
	@Test
	public void hLoginPageTest() {
		hLogin.dropdown();
		hLogin.hLoginClick();
		
String title=		driver.getTitle();
System.out.println(title);
		Assert.assertEquals(title, prop.getProperty("headloginpagetitle"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
	
}
