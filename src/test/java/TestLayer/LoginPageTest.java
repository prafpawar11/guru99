package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import PageLayer.LoginPage;

@Test(groups = { "LoginPage" })
public class LoginPageTest extends BaseClass {

	LoginPage loginPage;

	@Test(priority = 1)
	public void validateLoginFunctionality() {
		loginPage = new LoginPage();
		loginPage.clickOnLoginLink();
		loginPage.loginFunctionality(prop.getProperty("uname"), prop.getProperty("pass"));
	}

	@Test(priority = 2)
	public void validateMessage() {

		Assert.assertEquals(loginPage.getMassage(), "Login Successfully");
	}

}
