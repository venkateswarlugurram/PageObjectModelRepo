package com.cps.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.cps.base.CPSBankingURL;
import Com.cps.pages.CustomerLoginPage;
import junit.framework.Assert;

public class CustomerLoginPageTest extends CPSBankingURL {
	CustomerLoginPage loginpage;
	public CustomerLoginPageTest() {
		super();
	}
	
	
	
@BeforeTest
public void setUp() {
		intialization();
		 loginpage=new CustomerLoginPage();
	}
@Test
public void loginTest() {
	boolean status=		loginpage.validateLoginLink();
System.out.println("LoginLink status:"+status);
		loginpage.clickLoginLink();
	loginpage.cuslogin(prop.getProperty("username"),prop.getProperty("password"));
String title=	loginpage.validateLoginPageTitle();
Assert.assertEquals(title, "Peace | Insurance Responsive Template");
}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
}
