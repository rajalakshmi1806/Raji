package pagescucum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class LoginPage extends SeMethods {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="username")
		WebElement eleuname;
		@FindBy(id="password")
		WebElement elepass;
		@FindBy(className="decorativeSubmit")
		WebElement eleSubmit;
		
		@And("username is entered as (.*)")
		public LoginPage enterusrname(String data){
			type(eleuname, data);
			return this;
		}
		@And("password is entered as (.*)")
		public LoginPage enterpass(String data){
			type(elepass, data);
			return this;
		}
		@And("Login is Clicked")
		public LeaftapsPage clickSubmit(){
			click(eleSubmit);
			return new LeaftapsPage();
		}
		
		
		
		//click(locateElement("linkText","CRM/SFA"));
	}


