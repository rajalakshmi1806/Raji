package editlead.pages.cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;



public class LeaftapsPage extends  Annotations {
	//create constructor
	public LeaftapsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="CRM/SFA")
	WebElement eleClickCrmsfa;

	@And("CrmSfa click")
	public MyHomePage clickCrmsfa()
	{
		click(eleClickCrmsfa);
		return new MyHomePage();
	}

}





	


	 
	 
	
	

