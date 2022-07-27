package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import acti.pages.EnterPage;
import acti.pages.LoginPage;

public class LoginPageTests extends BaseTest{
	
	
	@Test(priority = 1)
	public void testLoginPageTitle()
	{
	    lp = new LoginPage();
	    String actual = "actiTIME - Login";
		String expected = lp.validateLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(priority = 2)
	public void testforgotPasswordLink()
	{
		boolean flag = lp.validateFogotPassword();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test(priority= 3)
	public void testActilogoisDisplayed()
	{
		boolean img = lp.validateActiImg();
		System.out.println(img);
		Assert.assertTrue(img);
	}
	
	@Test(priority= 4)
	public void testLoginFunction()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		ep = new EnterPage();
		String actual = "John Doe";
		String expected = ep.validateUserLoggedIn();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		ep.clickLogout();
		
	}

}
