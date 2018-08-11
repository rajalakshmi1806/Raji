package week3.hw;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
  @Test
public class FindLeads extends SeMethods {
	public void Leads()
	{
    startApp("chrome","http://leaftaps.com/opentaps");
    WebElement user = locateElement("username");
    type(user, "DemoSalesManager");
    WebElement pass = locateElement("password");
    type(pass,"crmsfa");
    WebElement logg = locateElement("decorativeSubmit");
    click(logg);
    WebElement crm = locateElement("link", "CRM/SFA");
   click(crm);

	
		
}
}

