package leaf.lead;



import org.testng.annotations.Test;

import wdMethods.Annotations;

public class MergeLead extends Annotations{

	@Test(groups= {"regression"})
	public void createLead() throws InterruptedException {
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Merge Leads"));
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		noSnapClick(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"), "Babu");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);		
		noSnapClick(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		noSnapClick(locateElement("linkText", "Merge"));
		acceptAlert();
		
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
	}
}