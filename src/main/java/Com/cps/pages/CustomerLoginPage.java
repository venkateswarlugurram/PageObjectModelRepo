package Com.cps.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.cps.base.CPSBankingURL;

public class CustomerLoginPage extends CPSBankingURL  {
	
	
@FindBy (xpath ="//a[text()='Login']")
	WebElement loginbutton;
	
	
@FindBy (xpath =".//*[@id='userId']")
	WebElement username;
	
	
@FindBy (xpath =".//*[@id='password']")
WebElement password;


@FindBy (xpath =".//*[@id='submit']")
WebElement submitbutton;


public CustomerLoginPage() {
	
	PageFactory.initElements(driver,this);
}

public String validateLoginPageTitle() {
	return driver.getTitle();
	}

public boolean validateLoginLink() {
boolean status=	loginbutton.isDisplayed();
return status;
}
public void clickLoginLink() {
	loginbutton.click();
}
public void cuslogin(String user,String pass) {
	username.sendKeys(user);
	password.sendKeys(pass);
	submitbutton.click();
	
	//return new ChangePasswordPage();
}



}
