package pom.duplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeadPage extends Annotations{
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Find Leads")
	WebElement eleClickFindLeads;

	public FindLeadPage eleClickFindLeads() {
		click(eleClickFindLeads);
		return new FindLeadPage();
	}
}
