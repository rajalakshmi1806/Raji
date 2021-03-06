package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;



public class CreateLeadPage extends  Annotations {
	//create constructor
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elePhoneNumber;
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleMailId;
	
	@FindBy(name="submitButton")
	WebElement eleClickSubmit;
	
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(eleCompanyName, cName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName)
	{
		type(eleFirstName, fName);
		return this;
	}
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLastName, lName);
		return this;
	}
	public CreateLeadPage typePhoneNumber(String ph)
	{
		type(elePhoneNumber, ph);
		return this;
	}
	public CreateLeadPage typeMailId(String mailId)
	{
		type(eleMailId, mailId);
		return this;
	}
	public ViewLeadsPageCreateLead clickSubmit()
	{
		click(eleClickSubmit);
		return new ViewLeadsPageCreateLead();
	}
}
	/*public  clickCreateLeadFail() {
		 click(eleSubmit);
		 return this;*/
	
	






	


	 
	 
	
	

