package Com.cps.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends ChangePasswordPage {

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	public static WebElement dropdown;

	@FindBy(xpath = "//ul[@class='dropdown-menu']//li//a")
public static	List<WebElement> dropdownlist;

	public DropDownPage() {
		PageFactory.initElements(driver, this);
	}

	public void dropdown() {
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).build().perform();}


	public static List<WebElement> getDropdownlist() {
		/*Iterator<WebElement> branch = dropdownlist.iterator();
		WebElement subbranch = branch.next();
		System.out.println(subbranch.getText());
		
		WebElement headbranch = branch.next();
		System.out.println(headbranch.getText());
		*/
		
		for(int i=0;i<dropdownlist.size();i++) {
			System.out.println(dropdownlist.get(i).getText());
			}
		
		return dropdownlist;
	}
	






}
