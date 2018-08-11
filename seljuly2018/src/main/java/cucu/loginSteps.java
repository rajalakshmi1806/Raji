package cucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {
	public ChromeDriver driver;
  @Given("Open the Browser")
	public void OpenBrowser() {
		System.setProperty("Webdriver.chrome.driver", "./drivers.chromedriver.exe");
		driver=new ChromeDriver();
	}
  @And("Maximize the window")
  public void maxWindow() {
	driver.manage().window().maximize();  
  }
  @And("Load the URL")
  public void loadUrl() {
	  driver.get("http://leaftaps.com/opentaps");
  }
  @And("Set the time")
  public void timeOut() {
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
  }
  
  @And("Enter the username as (.*)")
  public void enterUserName(String username) {
	  driver.findElementById("username").sendKeys(username);
  }
  @And("Enter the password as (.*)")
  public void enterPassword(String password) {
	  driver.findElementById("password").sendKeys(password);
  }
  
  @When("Click On the login button")
  public void clickLogin() {
	  driver.findElementByClassName("decorativeSubmit").click();
  }
  
  @Then("Verify login is successful")
  public void verifylogin()
  {
	  System.out.println("Login Successful");
  }
  
  @But("Verify login Failed")
  public void failedLogin() {
	  System.out.println("Login Failed");
  }
  
  @And("Click on crmsfa")
  public void ClickCRMSFA()
  {
	  driver.findElementByLinkText("CRM/SFA").click();
  }
  @And("click on Leads")
  public void clickLeads()
  {
	  driver.findElementByLinkText("Leads").click();
  }
  @And("Click on create lead")
  public void createLead()
  {
	  driver.findElementByLinkText("Create Lead").click();
  }
  @And("Enter Company name as (.*)")
  public void companyName(String companyname)
  {
	  driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
  }
  @And("Enter First name as (.*)")
  public void firstName(String firstname)
  {
	  driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
  }
  @And("Enter Last name as (.*)")
  public void lastName(String lastname)
  {
	  driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
  }
  @When("Click create lead")
  public void clickCreateLead()
  {
	  driver.findElementByClassName("smallSubmit").click();
  }
@Then("Verify lead is created succesfully")
public void verifyLead()
{
	System.out.println("The Lead Created Successfully");
}
}
