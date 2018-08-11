package week2.day2;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class DropDownCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

				//To Execute in Background
				//ChromeOptions op=new ChromeOptions();
				//op.setHeadless(true);
				//ChromeDriver driver=new ChromeDriver(op);

				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");	
				driver.findElementById("username").sendKeys("DemosalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				Thread.sleep(5000);
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Create Lead").click();
				//get number of dropdown in creater lead
			    List<WebElement> allDropdown= driver.findElementsByTagName("Select");
			    int all=allDropdown.size();
			    System.out.println(all);
				driver.findElementByLinkText("Logout").click();
				driver.close();
			}
}


	
