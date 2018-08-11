package pom.duplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLead extends Annotations{
	
	public ViewLead() {
		PageFactory.initElements(driver, this);
	}			
		@FindBy(xpath="//a[text()='Duplicate Lead']")
		WebElement eleClickDuplicateLeads;
		
		
	public DuplicateLeadPage eleClickDuplicate()
		{
			click(eleClickDuplicateLeads);
			return new DuplicateLeadPage();
		}

		
		

	}



