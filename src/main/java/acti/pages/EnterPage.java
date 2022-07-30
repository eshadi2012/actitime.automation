package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;
import acti.utils.Helper;

public class EnterPage extends DriverManager{
	
//*****************************Page Element****************************
	
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textUserLogged;
	@FindBy(id="container_tasks") WebElement menutask;

//*****************************Page initialization************************
	
	public EnterPage() 
	{
		PageFactory.initElements(driver, this);	
	}

	//***************************** Page Action/ Method ************************	
	public void clickTaskMenu()
	{
		menutask.click();	
	}
	
	public void clickLogout()
	{
		Helper.fn_sleep();
		linkLogout.click();
	}
	
	public String validateUserLoggedIn() 
	{
		return textUserLogged.getText();
	}

}
