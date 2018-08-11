package week3.hw;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLead extends SeMethods {
	
	@Test
	public void Merge() throws InterruptedException{
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement eleName= locateElement("username");
		type(eleName, "DemoSalesManager");
		WebElement elePassword=locateElement("password");
		type(elePassword, "crmsfa");
		WebElement log=locateElement("class","decorativeSubmit");
	    click(log);	
	    WebElement clickCrm=locateElement("link","CRM/SFA");
	    click(clickCrm);
	    WebElement lead=locateElement("xpath", "//a[text()='Leads']");
	    click(lead);
	    //click merge lead
	   WebElement merge = locateElement("xpath", "//a[text()='Merge Leads']");
	   click(merge);
	   WebElement firstLead = locateElement("xpath","(//table[@id='widget_ComboBox_partyIdFrom']/following::img)[1]");
	   click(firstLead);
	   Thread.sleep(2000);
	   switchToWindow(1);
	   WebElement find =locateElement("xpath","(//div[@class='x-form-element']/input)[1]");
	   type(find,"10430");
	   WebElement clickLead =locateElement("xpath","//button[text()='Find Leads']");
	   click(clickLead);
	   WebElement firstEntry =locateElement("xpath","//a[text()='raji']");
	   noSnapClick(firstEntry);
	   switchToWindow(0);
       //second entry
	   WebElement secondLead =locateElement("xpath","(//table[@id='widget_ComboBox_partyIdFrom']/following::img)[2]");
	   noSnapClick(secondLead);
	   Thread.sleep(2000);
	   switchToWindow(1);
	   WebElement findTwo =locateElement("xpath","(//div[@class='x-form-element']/input)[1]");
	   type(findTwo,"10438");
	   WebElement clickLeadTwo =locateElement("xpath", "//button[text()='Find Leads']");
	   noSnapClick(clickLeadTwo);
	   WebElement secondEntry =locateElement("xpath","//a[text()='raji']");
	   noSnapClick(secondEntry);
	   Thread.sleep(2000);
	   switchToWindow(0);
	   Thread.sleep(2000);
	   WebElement mm = locateElement("xpath", "//a[text()='Merge']");
	   noSnapClick(mm);
	   acceptAlert();
	   WebElement fl = locateElement("xpath", "//a[text()='Find Leads']");
	   noSnapClick(fl);
	   //enter lead id in find lead tab
	   WebElement ty = locateElement("xpath", "(//div[@class='x-form-element']/input)[13]");
	   type(ty, "10430");
	   WebElement cl = locateElement("xpath", "//button[text()='Find Leads']");
	   noSnapClick(cl);
	   WebElement name = locateElement("xpath", "//div[text()='No records to display']");
	   verifyExactText(name, "No records to display");
	   closeBrowser();
	}
}
