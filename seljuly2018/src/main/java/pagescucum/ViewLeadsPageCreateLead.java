package pagescucum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;


public class ViewLeadsPageCreateLead extends  Annotations {
	//create constructor
	public ViewLeadsPageCreateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleVerifyName;
	
	@And("First name is verified as (.*)")
public ViewLeadsPageCreateLead verifyFirstName(String fName){
	verifyExactText(eleVerifyName,fName);
		return  this;
	}
}


