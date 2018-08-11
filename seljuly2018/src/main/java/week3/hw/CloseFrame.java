package week3.hw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.findElementByXPath("(//button[text()='Close Me'])[1]").click();
		driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
		Thread.sleep(1000);
		WebElement fra=driver.findElementById("childIframe");
		driver.switchTo().frame(fra);
		driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west ui-layout-pane-hover ui-layout-pane-west-hover ui-layout-pane-open-hover ui-layout-pane-west-open-hover']/p/button").click();
		driver.switchTo().defaultContent();
			
		
		
	}

}
