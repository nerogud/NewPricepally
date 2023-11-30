package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#firstname")
	WebElement firstNameField;
	
	@FindBy(css="#lastname")
	WebElement lastNameField;
	
	@FindBy(css="#username")
	WebElement usernameField;
	
	@FindBy(css="#email")
	WebElement emailField;
	
	@FindBy(css="#password")
	WebElement passwordField;
	
	@FindBy(css="input[value='+234']")
	WebElement phoneNumberField;
	
	@FindBy(css="input[name='yes']")
	WebElement yesCheckBox;
	
	@FindBy(css="input[name='individual']")
	WebElement individualAccountCheckbox;
	
	@FindBy(css=".btn-primary.fw-800.w-full.py-2")
	WebElement createAccountButton;
	
	public void setFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	public void setUsername(String username) {
		usernameField.sendKeys(username);
	}
	public void setEmail(String email) {
		emailField.sendKeys(email);
	}
	public void  setPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void setPhoneNumber(String phone) {
		phoneNumberField.sendKeys(phone);
	}
	public void clickYesCheckBox() {
		yesCheckBox.click();
	}
	public void clickIndividualAccountCheckbox() {
		individualAccountCheckbox.click();
	}
	public void clickCreateAccountButton() {
		createAccountButton.click();
	}
	

}
