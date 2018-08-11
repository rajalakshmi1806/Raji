package week6.day1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations{
	@BeforeTest
	public void setvalues() {
		excelFileName="createlead";
		testName="Create Lead";
		testDesc="Creating A new lead";
		category="smoke";
		author="raji";
		moduleName="Lead";
	}
		@Test(dataProvider="passData")
		public void createLead(String cName,String fName,String lName,String ph,String mailId) {
			WebElement leads = locateElement("linktext","Create Lead");
			click(leads);
			WebElement companyName = locateElement("createLeadForm_companyName");
			type(companyName,cName);
			WebElement firstName = locateElement("createLeadForm_firstName");
			type(firstName,fName);
			WebElement lastName = locateElement("createLeadForm_lastName");
			type(lastName,lName);
			WebElement phone = locateElement("createLeadForm_primaryPhoneNumber");
			type(phone,ph);
			WebElement email = locateElement("createLeadForm_primaryEmail");
			type(email,mailId);
			WebElement createLeadButton = locateElement("class","smallSubmit");
			click(createLeadButton);
		
	}
		
		@DataProvider(name="passData")
		public Object[][] passData() throws IOException{
			ReadExcel1 excel=new ReadExcel1();
			return excel.readExcel("createlead");
		
		}

}
