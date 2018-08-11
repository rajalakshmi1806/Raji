package pom.duplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class DuplicateLeadPage extends Annotations {
 public DuplicateLeadPage() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//input[@class='smallSubmit']")
 WebElement eleClickCreate;
 
 public verifyViewPage eleClickCreateLead() {
	 click(eleClickCreate);
	 return new verifyViewPage();
 }
}
