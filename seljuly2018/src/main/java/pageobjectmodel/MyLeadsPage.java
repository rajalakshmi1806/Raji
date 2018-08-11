package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeadsPage extends Annotations{
	//create constructor
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeads;
	
	public CreateLeadPage clickCreateLeads()
	{
		click(eleCreateLeads);
		return new CreateLeadPage();
	}
	

}




