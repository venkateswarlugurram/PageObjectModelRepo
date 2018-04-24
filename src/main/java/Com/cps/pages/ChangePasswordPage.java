package Com.cps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ChangePasswordPage extends CustomerLoginPage{
	
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement changepasslink;
	
	
	
	@FindBy (xpath="//label[text()='Old Password']//following-sibling::input")
	WebElement oldpass;
	
	@FindBy (xpath="//label[text()='Confirm Old Password']//following-sibling::input")
	WebElement confirmoldpass;
	
	@FindBy (xpath="//label[text()='New Password']//following-sibling::input")
	WebElement newpass;
	
	@FindBy (xpath="//button[text()='Submit ']")
	WebElement submit;
	
	
	@FindBy (xpath="//h2[text()='ENTERED WRONG PASSWORD']")
	WebElement disText;
	
	
	
	
	
	public ChangePasswordPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickOnCP() {
		changepasslink.click();
		}
	public void enterCpDetails() {
		oldpass.clear();
		oldpass.sendKeys(prop.getProperty("oldpassword"));
		confirmoldpass.clear();
		confirmoldpass.sendKeys(prop.getProperty("confirmpassword"));
		newpass.clear();
		newpass.sendKeys(prop.getProperty("newpassword"));
		submit.click();
		
	}
	public String verifytitle() {
	return	driver.getTitle();
		
	}
	
	public void verifyText() {
	if	(disText.getText().equals(prop.getProperty("wrongtext"))){
		System.out.println("Unable to change password");
	}else {
		System.out.println("password changed successfully");
	}
		
		
	}	
	

}
