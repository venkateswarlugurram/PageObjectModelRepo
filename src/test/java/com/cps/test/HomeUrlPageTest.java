package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.cps.base.CPSBankingURL;
import Com.cps.pages.HomeUrlPage;

public class HomeUrlPageTest extends CPSBankingURL {
	HomeUrlPage homeurl;
	
	public HomeUrlPageTest() {
		super();
	}


	@BeforeMethod
	public void setUp() {
		intialization();
		homeurl = new HomeUrlPage();
          	}

	@Test
	public void homepagetest()  {
		
		//Assert.assertEquals(title, prop.getProperty("excepted_title"));
  }
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	               }
}
