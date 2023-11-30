package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#email")
	WebElement emailInputField;
	
	@FindBy(css="#password")
	WebElement passwordInputField;
	
	@FindBy(css=".btn-primary.fw-800.w-full.py-2")
	WebElement loginButton;
	
	@FindBy(css=".text-tertial.fw-600")
	WebElement createNowLinkText;
	
	public void setEmail(String email) {
		emailInputField.sendKeys(email);
	}
	public void setPassword(String password) {
		passwordInputField.sendKeys(password);
	}
	public void clickCreateNowLinkText() {
		createNowLinkText.click();;
	}

}
