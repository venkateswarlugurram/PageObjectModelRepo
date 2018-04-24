package Com.cps.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage extends CustomerLoginPage{
public  static WebDriver driver;



@FindBy(xpath="//a[text()='TRANSFER']")	
	WebElement transferlink;




@FindBy(xpath="//ul[@class='dropdown-menu']")	
public static List<WebElement> links;





public TransferPage() {
	PageFactory.initElements(driver, this);
}



public void clickLoginLink() {
	loginbutton.click();
}	


public void verifyTransfer() {
	Actions action=new Actions(driver);
	action.moveToElement(transferlink);
}

public List<WebElement> transLinks(){
	
	for(int i=0;i<links.size();i++) {
		System.out.println(links.get(i).getText());
	}
	
	
	return links;
	}













}
