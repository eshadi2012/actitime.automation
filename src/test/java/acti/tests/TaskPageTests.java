package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



/*
 * Name:
 * Developed by: Shova
 * Approved by: Kathy
 * Last Modified Date: 7/26/2022
 * Description : LoginPage Elements & its methods
 */

public class TaskPageTests extends BaseTest{
	
	@Test(priority = 1)
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
	tp.enterCustomerDiscription("this is for tf");
	tp.clickCreateCustomer();
	String successmessage = tp.getSucessMessage();
	Assert.assertTrue(successmessage.contains("has been created"));
	ep.clickLogout();
		
	}
	@Test(priority = 2)
	public void testDeleteCustomer()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		String expected="John Doe";
		String actual = ep.validateUserLoggedIn();
		Assert.assertEquals(actual, expected);
		ep.clickTaskMenu();
		tp.enterCustomerType("tf");
		tp.clicksearchCustomer();
		tp.clickEditButton();
		tp.clickAction();
		tp.clickDelete();
		tp.clickDeletePermanatly();
		String successmessage = tp.getSucessMessage();
		Assert.assertTrue(successmessage.contains("has been deleted"));
		ep.clickLogout();
		
	}

}
