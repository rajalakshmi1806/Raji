package ProMet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods{
	public void login() throws InterruptedException {
		startApp("chrome","http://leaftaps.com/opentaps/");
		WebElement username = locateElement("id","username");
		type(username,"DemosalesManager");
		WebElement password = locateElement("id","password");
		type(password,"crmsfa");
		Thread.sleep(3000);
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
	}
}