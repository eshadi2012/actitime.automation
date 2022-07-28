package acti.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest{
	
	@Test
	public void testCreateCustomer()
	{
	lp.enterUsername("admin");
	lp.enterPassword("manager");
	lp.clickLogin();
	String expected="John Doe";
	String actual = ep.validateUserLoggedIn();
	Assert.assertEquals(actual, expected);
	ep.clickTaskMenu();
	tp.clickAddNew();
	tp.clickNewCustomer();
	tp.enterCustomerName("tf");
	tp.enterCustomerDiscription("t");
	tp.clickCreateCustomer();
	String successmessage = tp.getSucessMessage();
	//System.out.println(successmessage);
	Assert.assertTrue(successmessage.contains("has been created"));
	ep.clickLogout();
	
		
	}

}
