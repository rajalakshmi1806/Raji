package week3.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ContactUS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		
		String firstWindowHAndle=driver.getWindowHandle();
		System.out.println(firstWindowHAndle);
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		Set<String> allwin=driver.getWindowHandles();
		List<String> all=new ArrayList<String>();
		all.addAll(allwin);
		driver.switchTo().window(all.get(1));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.switchTo().window(all.get(0));
		driver.findElementByXPath("//a[text()='Compatible Browser']").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//
		//
		//find how to get text from compatible window
		
	}

}
