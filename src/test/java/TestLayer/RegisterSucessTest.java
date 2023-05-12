package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import PageLayer.RegisterSucess;

@Test(groups = { "RegisterSucess" }, dependsOnGroups = { "RegisterPage" })
public class RegisterSucessTest extends BaseClass {
	private RegisterSucess registersucess;

	@Test(priority = 1)
	public void validateSucessPageUrl() {
		registersucess = new RegisterSucess();
		Assert.assertEquals(true, registersucess.captureSucessPageUrl().contains("sucess"));
	}

	@Test(priority = 2)
	public void validateFirstName() {
		Assert.assertEquals(true, registersucess.captureFirstAndLastname().contains(prop.getProperty("fname")));
	}

	@Test(priority = 3)
	public void validateLastName() {
		Assert.assertEquals(true, registersucess.captureFirstAndLastname().contains(prop.getProperty("lname")));
	}

	@Test(priority = 4)
	public void validateEmailId() {
		Assert.assertEquals(true, registersucess.captureUsername().contains(prop.getProperty("uname")));
	}
	
	
	@Test
	public void abc()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void abc10000()
	{
		Assert.assertEquals(true, true);
	}

	@Test
	public void xyz()
	{
		Assert.assertEquals(true, true);
	}
	

	@Test
	public void pqr()
	{
		Assert.assertEquals(true, true);

	}
	
	@Test
	public void pqr1()
	{
		Assert.assertEquals(true, true);
		//Hello this new Line`:

	}

	@Test
	public void pqr200()
	{
		Assert.assertEquals(true, true);
		//Hello this new Line`:

	}

	@Test
	public void p1()
	{
		Assert.assertEquals(true, true);
		//Hello this new Line`:
//Hello new code

	}

	@Test
	public void p2()
	{
		Assert.assertEquals(true, true);
		//Hello this new Line`:
//Hello new code

	}
	
	
	@Test
	public void p2900()
	{
		Assert.assertEquals(true, true);
		//Hello this new Line`:
//Hello new code

	}
	
	
	
	


}
