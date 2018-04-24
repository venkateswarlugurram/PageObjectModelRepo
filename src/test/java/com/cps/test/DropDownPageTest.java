package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.cps.base.CPSBankingURL;
import Com.cps.pages.DropDownPage;

public class DropDownPageTest extends CPSBankingURL {
	DropDownPage DDP;

	public DropDownPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		DDP = new DropDownPage();

	}

	@Test
	public void dropDownTest() {

		DDP.dropdown();
		DropDownPage.getDropdownlist();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
