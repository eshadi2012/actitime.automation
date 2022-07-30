package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import acti.driver.DriverManager;
import acti.utils.Helper;

public class TaskPage extends DriverManager{
	
	
//*****************************Page Element********************************
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement buttonAddNew;
	@FindBy(xpath= "//div[@class='item createNewCustomer']") WebElement itemNewCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement textCustomerName;
	@FindBy(xpath="(//textarea[@placeholder='Enter Customer Description'])[1]") WebElement textAreaCustomerDescription;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer;
	@FindBy(xpath= "//span[@class='innerHtml']") WebElement TextSuccessMessage;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxstarttyping;
	@FindBy(xpath="//span[@class='highlightToken']") WebElement searchCustomer; 
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']") WebElement buttonAction;
	@FindBy(xpath="(//div[@class='deleteButton'])[1]") WebElement buttonDelete;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanatly;
	

//*****************************Page initialization**************************************
		

		public  TaskPage() 
		{
			PageFactory.initElements(driver, this);	
		}

//***************************** Page Action/ Method ***********************************
		
		public void clickDeletePermanatly()
		{
			buttonDeletePermanatly.click();
			Helper.fn_sleep();
			
		}
		public void clickDelete()
		{
			buttonDelete.click();
		}
		
		public void clickAction()
		{
			buttonAction.click();
			Helper.fn_sleep();
		}
		
		public void clickEditButton()
		{
			buttonEdit.click();
			Helper.fn_sleep();
		}
		
		public void clicksearchCustomer()
		{
			searchCustomer.click();
			Helper.fn_sleep();
			
		}
		
		public void enterCustomerType(String customername)
		{
			textboxstarttyping.sendKeys(customername);
		
		}
		
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
		
		public void enterCustomerDiscription(String customerdescription)
		{
			textAreaCustomerDescription.sendKeys(customerdescription);
			Helper.fn_sleep();
		}
		public void clickCreateCustomer()
		{
			buttonCreateCustomer.click();
			Helper.fn_sleep();
		}
		
		public String getSucessMessage() 
		{
			return TextSuccessMessage.getText();	
		}
		
		/*public String getTaskPageTitle()
		{
			return driver.getTitle();
		}*/

}
