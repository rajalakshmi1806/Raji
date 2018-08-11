package week4.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedUserInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");

		//Droppable
		driver.findElementByLinkText("Droppable").click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
		System.out.println("Draged and dropped to target location correctly");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		//Sortable
		driver.findElementByLinkText("Sortable").click();
		WebElement frame1 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame1);
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement item5 = driver.findElementByXPath("//ul[@id='sortable']/li[5]");
		int location = item5.getLocation().getY();
		builder.dragAndDropBy(item1, 0, location).perform();
		System.out.println("Moved item1 to "+location+" co-ordinate correctly");
	}

}
