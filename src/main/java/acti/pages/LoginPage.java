package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

public class LoginPage extends DriverManager{

/*
 * Name:
 * Developed by: Ajith
 * Approved by: Rekha
 * Last Modified Date: 7/26/2022
 * Description : LoginPage Elements & its methods
 */
	
//**********************Page Element *************************************
	
	@FindBy(id="username") WebElement textboxUsername;
	@FindBy(name="pwd") WebElement textboxPassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement buttonLogin;
	@FindBy(linkText="Forgot your password?") WebElement linkForgotPassword;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement imgActiLogo;
	
	//**********************Page Initialization *************************************
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);   //this meaning present webelement	
	}

	//**********************Page Actions *************************************	
	
	public void enterUsername(String username) 
	{
		textboxUsername.sendKeys(username);
	}
	
	public void enterPassword(String password) 
	{
		textboxPassword.sendKeys(password);
	}
	
	public void clickLogin() 
	{
		buttonLogin.click();	
	}
	
	public boolean validateFogotPassword() 
	{
		return linkForgotPassword.isDisplayed();
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateActiImg() 
	{
		return imgActiLogo.isDisplayed();
		
	}
	

}
