package editlead.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC002_EditLead extends Annotations {
	@BeforeTest
	public void setvalues() {
		excelFileName="Editlead";
		testName="Edit Lead";
		testDesc="Editting An existing lead";
		category="sanity";
		author="raji";
		moduleName="Lead";
	}
	@Test/*(dataProvider="fetchData")*/
	public void EditLead() throws InterruptedException
	{
		new MyHomePage()
		.clickLeads()
		.eleFindLeadsPage()
		.eleFindPage()
		.eleClickEdit()
		.eleEditLeadsPage();
		
		
	}
}
