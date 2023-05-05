package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item 1\"]"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()=\"Item 2\"]"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()=\"Item 3\"]"));
		action.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item2)
		.click(item3);
		action.keyUp(Keys.CONTROL).perform();
		//WebElement element = driver.findElement(By.id("draggable"));
		//action.dragAndDropBy(element,150, 10).build().perform();
		//WebElement from = driver.findElement(By.id("draggable"));
		//WebElement to = driver.findElement(By.id("droppable"));
		//action.dragAndDrop(from, to).build().perform();		
		
	}
	

}
