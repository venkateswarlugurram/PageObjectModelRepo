package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.cps.pages.ChangePasswordPage;

public class ChangePasswordPageTest extends ChangePasswordPage {
	ChangePasswordPage cp;

	public ChangePasswordPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		cp = new ChangePasswordPage();

	}

	@Test
	public void cpTest() throws Exception {
		cp.clickLoginLink();
		cp.cuslogin(prop.getProperty("username"), prop.getProperty("password"));
		cp.clickOnCP();
		cp.enterCpDetails();
		Thread.sleep(10000);
		String title = cp.verifytitle();
		Assert.assertEquals(title, prop.getProperty("cptitle"));
		cp.verifyText();

	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}
}
