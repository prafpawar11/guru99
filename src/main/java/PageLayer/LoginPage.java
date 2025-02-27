package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//a[text()=' sign-in ']")
	private WebElement loginLink;

	@FindBy(name = "userName")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "submit")
	private WebElement submit;

	@FindBy(xpath = "//h3[text()='Login Successfully']")
	private WebElement message;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void loginFunctionality(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.submit.click();
	}

	public String getMassage() {
		return this.message.getText();
	}

}
