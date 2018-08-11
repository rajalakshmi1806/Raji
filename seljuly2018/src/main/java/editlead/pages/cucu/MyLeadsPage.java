package editlead.pages.cucu;

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
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	@And("FindLead click")
	public FindLeadPage eleFindLeadsPage()
	{
		click(eleFindLeads);
		return new FindLeadPage();
		
	}
	

}




