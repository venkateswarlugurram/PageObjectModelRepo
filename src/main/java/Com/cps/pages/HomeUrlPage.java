package Com.cps.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Com.cps.base.CPSBankingURL;

public class HomeUrlPage extends CPSBankingURL {
 WebDriver driver;

public HomeUrlPage() {
	PageFactory.initElements(driver, this);
}

	
public  String validateHomepagetitle() {
	return driver.getTitle();
}	
	
	
	
	
}
