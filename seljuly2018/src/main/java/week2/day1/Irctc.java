package week2.day1;
import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Irctc {

	private Object key;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("raji1806");
		driver.findElementById("userRegistrationForm:password").sendKeys("13EC1235r");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("13EC1235r");
        WebElement dropdown =driver.findElementById("userRegistrationForm:securityQ");
        Select nest=new Select(dropdown);
        nest.selectByIndex(1);
        driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Caramel");
        WebElement dr=driver.findElementById("userRegistrationForm:prelan");
        Select nr=new Select(dr);
        nr.selectByValue("en");
        Thread.sleep(1000);
        driver.findElementById("userRegistrationForm:firstName").sendKeys("Raji");
        driver.findElementById("userRegistrationForm:lastName").sendKeys("Raghu");
        driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement date=driver.findElementById("userRegistrationForm:dobDay");
		Select dat=new Select(date);
		dat.selectByValue("18");
		WebElement month=driver.findElementById("userRegistrationForm:dobMonth");
		Select mon=new Select(month);
		mon.selectByValue("06");
		WebElement year=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yr=new Select(year);
		yr.selectByValue("1995");
		WebElement company=driver.findElementById("userRegistrationForm:occupation");
		Select com=new Select(company);
		com.selectByIndex(3);
		WebElement countries=driver.findElementById("userRegistrationForm:countries");
		Select con=new Select(countries);
		con.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("rajiraghu2018@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9087317718");
		WebElement national=driver.findElementById("userRegistrationForm:nationalityId");
		Select nat=new Select(national);
		nat.selectByIndex(1);
		driver.findElementById("userRegistrationForm:address").sendKeys("No:144a");
		driver.findElementById("userRegistrationForm:street").sendKeys("College Road");
		driver.findElementById("userRegistrationForm:area").sendKeys("Palavanthangal");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600114",Keys.TAB);
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("Tamilnadu",Keys.TAB);
		Thread.sleep(5000);
		WebElement city=driver.findElementById("userRegistrationForm:cityName");
		Select ci=new Select(city);
		/*List<WebElement> allOptions = ci.getOptions();
		int size = allOptions.size();
		System.out.println(size);*/
		ci.selectByValue("Kanchipuram");
		//city.sendKeys(Keys.TAB);
		//postffice
		Thread.sleep(10000);
		WebElement post=driver.findElementById("userRegistrationForm:postofficeName");
		post.click();
	    Select po=new Select(post);
	  /*  List<WebElement> all=po.getOptions();
		int good=all.size();
		System.out.println(size);
		Thread.sleep(10000);*/
		po.selectByVisibleText("Pazhavanthangal S.O");
		city.sendKeys(Keys.TAB);
		driver.findElementById("userRegistrationForm:landline").sendKeys("04443522109");
   
	}
}
		