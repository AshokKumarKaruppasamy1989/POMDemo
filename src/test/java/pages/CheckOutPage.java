package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class CheckOutPage extends TestBase {

	@FindBy(id = "s-name")
	WebElement nameTextbox;

	@FindBy(id = "s-address")
	WebElement addressTextbox;

	@FindBy(id = "single")
	WebElement singlePackageRadioBtn;

	@FindBy(xpath = "//button[contains(text(),'Buy')]")
	WebElement buyBtn;

	public void enterName(String strName) {
		nameTextbox.sendKeys(strName);
	}

	public void enterAddress(String strAdd) {
		nameTextbox.sendKeys(strAdd);
	}

	public void selectSinglepackageRadioBtn() {
		singlePackageRadioBtn.click();
	}

	public void buyTheprodut() {
		buyBtn.click();
	}
}
