package pagescucum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class MyLeadsPage extends Annotations{
	//create constructor
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeads;
	@And("Create Lead Button is Clicked")
	public CreateLeadPage clickCreateLeads()
	{
		click(eleCreateLeads);
		return new CreateLeadPage();
	}
	

}




