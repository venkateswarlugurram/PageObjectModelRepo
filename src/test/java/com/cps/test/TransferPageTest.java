package com.cps.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.cps.base.CPSBankingURL;
import Com.cps.pages.TransferPage;
import junit.framework.Assert;

public class TransferPageTest extends CPSBankingURL {
	TransferPage transfer;

	public TransferPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		transfer = new TransferPage();
	}

	@Test
	public void verifyTransferLinks() throws Exception {
		
		boolean status=		transfer.validateLoginLink();
		System.out.println("LoginLink status:"+status);
		transfer.clickLoginLink();
		transfer.cuslogin(prop.getProperty("username"),prop.getProperty("password"));
		String title=	transfer.validateLoginPageTitle();
		Assert.assertEquals(title, "Peace | Insurance Responsive Template");
		
		/*		
		Thread.sleep(5000);
		System.out.println(transfer.validateLoginLink());
		transfer.clickLoginLink();
	transfer.cuslogin(prop.getProperty("username"), prop.getProperty("password"));
		transfer.dropdown();
		transfer.transLinks();*/
	} 

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
