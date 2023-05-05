package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassassignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0w5oly810conh6fqb43fabe4p224708.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Actions action=new Actions(driver);
     // WebElement new1 = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
      Actions action=new Actions(driver);
      WebElement row1 = driver.findElement(By.xpath("(//td[@class='ui-sortable-handle'])[1]"));
      WebElement row2 = driver.findElement(By.xpath("(//td[@class='ui-sortable-handle'])[2]"));
   action.clickAndHold(row1).moveToElement(row2).release(row2).perform();
      //action.dragAndDropBy(new1,60 , 0).perform();
        /*WebElement start =driver.findElement(By.xpath("//button[@id='form:j_idt119']"));
        action.click(start).perform();*/
        /*WebElement row1 = driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper'][1]//thead[1]//th[1]"));
        WebElement row2 = driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper'][1]//thead[1]//th[2]"));
        action.dragAndDrop(row2, row1).perform();*/
       
       /* WebElement target  = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
        WebElement from=driver.findElement(By.xpath("//div[@id='form:drop']"));
        action.dragAndDrop(target,from).perform();*/
        
        /*WebElement box = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
        action.dragAndDropBy(box, 100, 100).perform();*/
   
	}

}
