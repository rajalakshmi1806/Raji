package julybatch;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class webtable {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://erail.in/");
			driver.findElementById("txtStationFrom").clear();
			driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
			driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
			boolean selected = driver.
					findElementById("chkSelectDateOnly").isSelected();
			// check CheckBox 
			if (selected) {
				driver.findElementById("chkSelectDateOnly").click();
			}
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
			List<WebElement> tr = table.findElements(By.tagName("tr"));
			
			for (WebElement eachTr : tr) {
				String text = eachTr.findElements(By.tagName("td")).get(1).getText();
				System.out.println(text);
			}
		}
}
			
			


