package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

public class TaskPage extends DriverManager{
	
//*****************************Page Element********************************
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement buttonAddNew;
	@FindBy(xpath= "//div[@class='item createNewCustomer']") WebElement itemNewCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement textCustomerName;
	@FindBy(xpath="/textarea[@placeholder='Enter Customer Description']") WebElement textAreaCustomerDescription;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer;
	@FindBy(xpath= "//span[@class='innerHtml']") WebElement TextSuccessMessage;

//*****************************Page initialization************************
		
		public  TaskPage() 
		{
			PageFactory.initElements(driver, this);	
		}

//***************************** Page Action/ Method ************************
		public void clickAddNew() 
		{
			buttonAddNew.click();
		}
		
		public void clickNewCustomer()
		{
			itemNewCustomer.click();	
		}
		
		public void enterCustomerName(String customername)
		{
			textCustomerName.sendKeys(customername);
		}
		
		public void enterCustomerDiscription(String custdescription)
		{
			textAreaCustomerDescription.sendKeys(custdescription);
		}
		public void clickCreateCustomer()
		{
			buttonCreateCustomer.click();
		}
		
		public String getSucessMessage() 
		{
			return TextSuccessMessage.getText();	
		}
		public String getTaskPageTitle()
		{
			return driver.getTitle();
		}

}
