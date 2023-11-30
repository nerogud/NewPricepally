package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="body > div:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)")
	WebElement lagosCheckbox;
	
	@FindBy(css=".btn-primary.fw-800.w-full.py-2")
	WebElement confirmCityButton;
	
	public void clickLagosCheckbox() {
		lagosCheckbox.click();
	}
	public void clickConfirmCity() {
		confirmCityButton.click();
	}

}
