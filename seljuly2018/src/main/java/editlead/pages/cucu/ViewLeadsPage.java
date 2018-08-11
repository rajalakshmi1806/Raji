package editlead.pages.cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;


public class ViewLeadsPage extends  Annotations {
	//create constructor
	public ViewLeadsPage() {
		PageFactory.initElements(driver, this);
	}	@FindBy(id="viewLead_firstName_sp")
	WebElement eleViewLeads;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eleClickEditLeads;
	
	@And("Edit Click")
public EditLeadPage eleClickEdit()
	{
		click(eleClickEditLeads);
		return new EditLeadPage();
	}

	
	

}
