package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement thomson = driver.findElementByXPath("//span[text()='Thomson']");
		Actions builder=new Actions(driver);
		builder.moveToElement(tv).pause(3000).click(thomson).perform();
	}

}
