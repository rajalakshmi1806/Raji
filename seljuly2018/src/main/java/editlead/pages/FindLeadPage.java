package editlead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations;

public class FindLeadPage extends Annotations{
	//create constructor
	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='x-form-item x-tab-item']//input)[2]")
	WebElement eleFindLeadsByName;
	@FindBy(xpath="(//button[@class='x-btn-text'])[7]")
	WebElement eleClickFindLeads;
	@FindBy(xpath="(//a[text()='raji'])[1]")
	WebElement eleSelect;
	
	public ViewLeadsPage eleFindPage() throws InterruptedException
	{
		type(eleFindLeadsByName,"raji");
		click(eleClickFindLeads);
		Thread.sleep(10000);
		click(eleSelect);
		return new ViewLeadsPage();
	}
	
		
	
	

}




