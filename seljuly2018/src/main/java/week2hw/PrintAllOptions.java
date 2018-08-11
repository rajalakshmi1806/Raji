package week2hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/crmsfa/control/createLeadForm;jsessionid=089793C1B0F329A0C43FE88B561CB780.jvm1");
       WebElement dropDown=driver.findElementById("createLeadForm_dataSourceId");
       Select dd=new Select(dropDown);
       List<WebElement> allOptions = dd.getOptions();
       for (WebElement allO : allOptions) {
			String text = allO.getText();
			System.out.println(text);
       }
	}
}