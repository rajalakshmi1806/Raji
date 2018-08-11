package wdMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import reporter.Reporter;

public class SeMethods extends Reporter implements WdMethods{
	public static RemoteWebDriver driver ;
	public Properties prop;
	int i = 1;
	public void loadObject() {
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream("H:/workspace/Sel/seljuly2018/src/main/resources/Object.Properties"));
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException has occured");
		} catch (IOException e) {
			System.err.println("IOException has occured");
		}
	}
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe");
				driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		catch (WebDriverException e) {
			System.err.println("WebDriverException has occured");
			reportStep("WebDriverException has occured", "Failed");
		} 
		catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");	
		}
		finally {
			takeSnap();
		}
		reportStep("The browser: "+browser+" launched successfully", "PASS");
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linkText": return driver.findElementByLinkText(locValue);	
			case"name": return driver.findElementByName(locValue);
			case "tag":return driver.findElementByTagName(locValue);
			}
		} 
		catch(NoSuchElementException e) {
			System.err.println("NoSuchElementException has occured");
			reportStep("NoSuchElementException has occured", "Failed");
		}
		catch (Exception e) {
			System.err.println("Exception  has occured");
			reportStep("Exception has occured", "Failed");
		}
		return null;
	}


	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportStep("The Data \"+data+\" is Entered Successfully", "PASS");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException  has occured");
			reportStep("WebDriverException has occured", "Failed");
		}
		catch (Exception e) {
			System.err.println("Exception  has occured");
			reportStep("Exception has occured", "Failed");
		}
		finally {
			takeSnap();	
		}		
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			reportStep("The Element "+ele+" is clicked Successfully", "PASS");
		} catch (InvalidElementStateException e) {
			System.err.println("InvalidElementStateException has occured");
			reportStep("InvalidElementStateException has occured", "Failed");
		}
		catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}
		finally {
			takeSnap();	
		}	
	}

	public void noSnapClick(WebElement ele)
	{
		try {
			ele.click();
		    reportStep("The Element "+ele+" is clicked Successfully", "PASS");
		}catch (InvalidElementStateException e) {
			System.err.println("InvalidElementStateException has occured");
			reportStep("InvalidElementStateException has occured", "Failed");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");

		}
	}
	public String getText(WebElement ele) {
		String textreturn="";
		try {
		    textreturn = ele.getText();
			//System.out.println(textreturn);
		   // System.out.println("The text" +textreturn+ "is obtained Succesfully");
		    reportStep("The text" +textreturn+ "is obtained Succesfully","PASS" );
		} catch (Exception e) {
			System.err.println("The text cannot be obtained");
			reportStep("The text cannot be obtained", "Failed");
		}
		return textreturn;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select drop=new Select(ele);
			drop.selectByVisibleText(value);
			reportStep("The dropdown " + value+ "is selected successfully", "PASS");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select drop=new Select(ele);
			drop.selectByIndex(index);
			reportStep("The dropdown " + index+ "is selected successfully", "PASS");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");		}
	}

	public boolean verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		boolean b=false;
		if(title.equals(expectedTitle))
		{
		   //System.out.println("The printed title"+expectedTitle+ "is verified");
			reportStep("The printed title " +expectedTitle+ "is verified", "Pass");
			b=true;
		}
		else
		{
			reportStep("The expected title is not printed", "Failed");
		}
		return b;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String name=ele.getText();
		try {
			if(name.equals(expectedText))
			{
				reportStep("The text" +expectedText+ "is verified", "Pass");

			}
			else
			{
				System.out.printf("The Text is incorrect");
			}
		} catch (Exception e) {
			System.err.println("Exception has occured");
            reportStep("Exception has occured", "Failed");
          }

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String name=ele.getText();
		try {
			if(name.contains(expectedText))
			{
				reportStep("The text" + expectedText+ " is verified", "Pass");
			}
			else
			{
				reportStep("The Text is incorrect", "Failed");
				System.out.printf("The Text is incorrect");
			}
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");

		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) { 
		String name = ele.getAttribute(value);
		try {
			if(name.equals(value))
			{
				reportStep("The Attribute" +name +" is verified", "Pass");
			}
			else
			{
				reportStep("The Attribute" +name +"is incorrect", "Failed");
			}
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) { 
		String name = ele.getAttribute(value);
		try {
			if(name.contains(value))
			{
				System.out.println("The Attribute" +name +"is verified");
				reportStep("The Attribute" +name +"is verified", "Passed");
			}
			else
			{
				System.out.println("The Attribute" +name +"is incorrect");
				reportStep("The Attribute" +name + "is incorrect", "Failed");
			}
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}

	}

	public void verifySelected(WebElement ele) { 
		try {
			if(ele.isSelected())
			{
				reportStep("It is selected", "Pass");
			}
			else
			{
				reportStep("It is not selected", "Failed");
			}
		} catch (Exception e) {
			
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}

	}

	public void verifyDisplayed(WebElement ele) {  
		try {
			if(ele.isDisplayed())
			{
				reportStep("Is Displayed", "Pass");
			}
			else
			{
				reportStep("Not displayed", "Failed");
			}
		} catch (Exception e) {
		System.err.println("Exception has occured");
		reportStep("Exception has occured", "Failed");
		}
	}

	public void switchToWindow(int index) {
		try {
			Set <String> allWin=driver.getWindowHandles();
			List<String> all=new ArrayList<String>();
			all.addAll(allWin);
			driver.switchTo().window(all.get(index));
			reportStep("Window is switched succesfully", "Pass");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
			}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			reportStep("Frame is switched succesfully", "Pass");
		} catch (Exception e) {
			System.err.println("Exception is occured");
			reportStep("Exception is occured", "Failed");
		}

	}

	public void acceptAlert() {
		try {
			Alert myAlert=driver.switchTo().alert();
			myAlert.accept();
			reportStep("Alert is accepted", "Pass");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}
	}

	public void dismissAlert() {
		try {
			Alert myAlert=driver.switchTo().alert();
			myAlert.dismiss();
			reportStep("Alert is dismissed", "Pass");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}
	}

	public String getAlertText() {
		try {
			Alert myAlert=driver.switchTo().alert();
			String myAlt=myAlert.getText();
			System.out.println("The text " +myAlt +"is obtained succesfully from alert window");
			reportStep("The text " +myAlt +"is obtained succesfully from alert window", "Pass");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Passed");
		}
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			System.err.println("Not able to take snapshot");
			reportStep("Not able to take snapshot", "Failed");
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			reportStep("The Browser is closed", "Pass");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
		}	
	}
	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("All browsers are closed");
			reportStep("All browsers are closed", "Pass");
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Failed");
			}	
		}	
	}

