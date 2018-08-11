package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WthreeSchools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement fraEle=driver.findElementById("iframeResult");
		driver.switchTo().frame(fraEle);
        Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert=driver.switchTo().alert();
		String myAlt=myAlert.getText();
		System.out.println(myAlt);
        myAlert.sendKeys("Raji");
        myAlert.accept();
        //come out of frame
        driver.switchTo().defaultContent();
        //click home
        driver.findElementById("tryhome").click();
        Thread.sleep(5000);
        Set <String> allWin=driver.getWindowHandles();
        List<String> all=new ArrayList<String>();
        all.addAll(allWin);
        driver.switchTo().window(all.get(0));
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        Thread.sleep(2000);
        driver.switchTo().frame(fraEle);
        driver.switchTo().window(all.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().defaultContent();
        driver.quit();	
	}

}
