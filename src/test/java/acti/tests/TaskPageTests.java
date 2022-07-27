package acti.tests;



public class TaskPageTests extends BaseTest{
	
	public void testCreateCustomer()
	{
	lp.enterUsername("admin");
	lp.enterPassword("manager");
	lp.clickLogin();
	ep.clickTaskMenu();
	tp.clickAddNew();
	tp.clickNewCustomer();
	tp.enterCustomerName("tf");
	tp.enterCustomerDiscription("t");
	tp.clickCreateCustomer();
	String successmessage = tp.getSucessMessage();
	System.out.println(successmessage);
		
	}

}
