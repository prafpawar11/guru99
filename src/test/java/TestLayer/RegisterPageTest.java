package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import PageLayer.RegisterPage;

@Test(groups = { "RegisterPage" })
public class RegisterPageTest extends BaseClass {
	@Parameters({ "browsers" })
	@BeforeTest
	public void setUp(String browses) {
		BaseClass.iniliazation(browses);
	}

	@Test
	public void validateRegisterFunctionality() {
		RegisterPage registerpage = new RegisterPage();
		registerpage.RegisterUser(prop.getProperty("fname"), prop.getProperty("lname"), "9019923321",
				prop.getProperty("uname"), "Pune", "Pune", "MH", "413412", "INDIA", prop.getProperty("uname"),
				prop.getProperty("pass"), prop.getProperty("cpass"));

	}

	@Test
	public void ab() {
		Assert.assertEquals(12, 12);
	}

	@Test
	public void p() {
		Assert.assertEquals(12, 12);
	}

	@Test
	public void p2() {
		Assert.assertEquals(12, 12);
	}

	@Test
	public void ab1() {
		Assert.assertEquals(12, 12);
	}

	@Test
	public void p1() {
		Assert.assertEquals(12, 12);
	}

	@Test
	public void tearDown1() {
		// driver.close();
	}

	@Test
	public void tearDown2() {
		// driver.close();
	}

	@Test
	public void tearDown3() {
		// driver.close();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
