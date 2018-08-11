package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations;



public class ViewLeadsPageCreateLead extends  Annotations {
	//create constructor
	public ViewLeadsPageCreateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='raji']")
	WebElement eleVerifyName;
	
	
public ViewLeadsPageCreateLead verifyFirstName(String fName){
	verifyExactText(eleVerifyName,fName);
		return  this;
	}
}


