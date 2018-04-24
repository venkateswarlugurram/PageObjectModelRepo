package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.cps.base.CPSBankingURL;
import Com.cps.pages.SubBranchLoginPage;

public class SubBranchLoginPageTest extends CPSBankingURL{

	SubBranchLoginPage sublogin;
	
	public SubBranchLoginPageTest() {
		super();
	}
	
	
	@BeforeMethod()
	public void setUp(){
		intialization();
		 sublogin=new SubBranchLoginPage();
		}
	
	@Test
	public void subBranchtest() {
		sublogin.dropdown();
		sublogin.clickOnFirst();
		String title=driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("subloginpagetitle"));
		
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
	
	
}
