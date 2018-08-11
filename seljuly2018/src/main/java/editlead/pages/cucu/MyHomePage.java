package editlead.pages.cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;



public class MyHomePage extends Annotations{
	//create constructor
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	@And("Leads click")
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage();
	}
}



	



