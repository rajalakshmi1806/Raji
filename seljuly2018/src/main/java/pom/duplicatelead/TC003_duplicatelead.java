package pom.duplicatelead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC003_duplicatelead extends Annotations{

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
	public void DuplicateLead() throws InterruptedException
	{
     new MyHomePage()
     .eleClickLead()
     .eleClickFindLeads()
     .eleFindPage()
     .eleClickDuplicate()
     .eleClickCreateLead()
     .VerifyDuplicateData();
}
}
