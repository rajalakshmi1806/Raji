package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations{
	@BeforeTest
	public void setvalues() {
		excelFileName="createlead";
		testName="Create Lead";
		testDesc="Creating A new lead";
		category="smoke";
		author="raji";
		moduleName="Lead";
	}
		@Test(dataProvider="fetchData")
		public void createLead(String cName,String fName,String lName,String ph,String mailId) {
	   
			new MyHomePage()
			.clickLeads()
			.clickCreateLeads()
			.typeCompanyName(cName)
			.typeFirstName(fName)
			.typeLastName(lName)
			.typePhoneNumber(ph)
			.typeMailId(mailId)
			.clickSubmit();
			//.verifyFirstName(fName);		
}
}