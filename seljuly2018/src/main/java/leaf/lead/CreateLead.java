package leaf.lead;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import exceldata.ReadExcel;
import wdMethods.Annotations;

public class CreateLead extends Annotations{

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName, String email, String ph) {			
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ph);
		click(locateElement("name", "submitButton"));			
	}
	
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws IOException {
		ReadExcel excel=new ReadExcel();
		return excel.readExcel("createlead");
		
	}
}












