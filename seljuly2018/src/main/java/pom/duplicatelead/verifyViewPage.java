package pom.duplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class verifyViewPage extends Annotations {
 public verifyViewPage() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(id="viewLead_firstName_sp")
 WebElement eleVerifyFirstName;
 
 public verifyViewPage VerifyDuplicateData() {
	 verifyExactText(eleVerifyFirstName, "Raji");
	 return this;
 }
}
