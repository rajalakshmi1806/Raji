package week3.hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		List<WebElement> tag=driver.findElementsByTagName("iframe");
		 int all=tag.size();
		 System.out.println("Number of frames");
		 System.out.println(all);
		 WebElement frame1=driver.findElementByXPath("//iframe[@class='ui-layout-north ui-layout-pane ui-layout-pane-north']");
		 driver.switchTo().frame(frame1);
		 List<WebElement> tagOne=driver.findElementsByTagName("iframe");
		 int allOne=tagOne.size();
		 System.out.println(allOne);
		 driver.switchTo().defaultContent();
		 WebElement frame2=driver.findElementByXPath("//iframe[@class='ui-layout-center ui-layout-pane ui-layout-pane-center']");
		 driver.switchTo().frame(frame2);
		 List<WebElement> tagTwo=driver.findElementsByTagName("iframe");
		 int allTwo=tagTwo.size();
		 System.out.println("frame2");
		 System.out.println(allTwo);
		 driver.switchTo().defaultContent();
		 WebElement frame3=driver.findElementByXPath("//iframe[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']");
		 driver.switchTo().frame(frame3);
		 List<WebElement> tagThree=driver.findElementsByTagName("iframe");
		 int allThree=tagThree.size();
		 System.out.println("frame3");
		 System.out.println(allThree);
		 driver.switchTo().defaultContent();
		 WebElement frame4=driver.findElementByXPath("(//iframe[@src='about:blank'])[2]");
		 driver.switchTo().frame(frame4);
		 List<WebElement> tagFour=driver.findElementsByTagName("iframe");
		 int allFour=tagFour.size();
		 System.out.println("frame4");
		 System.out.println(allFour);
		
		/* WebElement frame5=driver.findElementByXPath("//iframe[@class='ui-layout-center ui-layout-pane ui-layout-pane-center']");
		 driver.switchTo().frame(frame5);
		 List<WebElement> tagFive=driver.findElementsByTagName("iframe");
		 int allFive=tagFive.size();
		 System.out.println(allFive);*/
		

	}

}
