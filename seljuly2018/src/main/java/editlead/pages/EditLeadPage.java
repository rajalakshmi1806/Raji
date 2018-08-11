package editlead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	
	public EditLeadPage eleEditLeadsPage() throws InterruptedException
	{
		type(eleUpdateName,"rajalakshmi");
		click(clickUpdate);
		return this;
	}
	
		
	
	

}




