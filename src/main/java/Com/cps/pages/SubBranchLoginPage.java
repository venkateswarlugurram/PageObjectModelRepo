package Com.cps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubBranchLoginPage  extends DropDownPage{
	
	
	
	@FindBy(xpath="//a[text()='Sub Branch Login']")
	WebElement sublogin;
	
	
	public void clickOnFirst() {
	/*	for(int i=0;i<dropdownlist.size();i++) {
		
		if(dropdownlist.equals(prop.getProperty("sublogin"))){
			dropdownlist.get(i).click();			
		}
		
	}
*/
		sublogin.click();
		
		
	
	}


	
	

}
