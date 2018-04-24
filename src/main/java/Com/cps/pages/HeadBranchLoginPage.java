package Com.cps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadBranchLoginPage extends DropDownPage {

	@FindBy(xpath = "//a[text()='Head Branch Login']")
	WebElement headlogin;

	public HeadBranchLoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void hLoginClick() {
		headlogin.click();

	}

}
