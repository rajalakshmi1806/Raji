package editlead.pages.cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class EditLeadPage extends Annotations{
	//create constructor
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="updateLeadForm_firstName")
	WebElement eleUpdateName;
	@FindBy(xpath="//input[@class='smallSubmit']")
	WebElement clickUpdate;
	@And("Edit Firstname and click submit")
	public EditLeadPage eleEditLeadsPage() throws InterruptedException
	{
		type(eleUpdateName,"rajalakshmi");
		click(clickUpdate);
		return this;
	}
	
		
	
	

}




