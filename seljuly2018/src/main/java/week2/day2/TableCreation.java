package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class TableCreation {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//Open URL 
				driver.get("http://www.leafground.com/pages/table.html");
				
				//WebTable Implementation
				//Counting rows and columns
				WebElement table1 = driver.findElementByXPath("//section[@class='innerblock']//table");
				List<WebElement> rows = table1.findElements(By.tagName("tr"));
				System.out.println(rows.size());
				
				List<WebElement> columns = table1.findElements(By.xpath("//section[@class='innerblock']//table//tr[2]/td"));
				System.out.println(columns.size());
				
				WebElement findvalue = table1.findElement(By.xpath("//section[@class='innerblock']//table//tr[3]/td[2]"));
				System.out.println(findvalue.getText());
				
				//Close window
				driver.close();
			}
}




