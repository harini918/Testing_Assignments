package practiseServiceNowApplication;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import io.github.sukgu.Shadow;


/*1.Create new incident
1. Launch ServiceNow application
2. Login with valid credentials (refer the document to create the instance)
3. Enter Incident in filter navigator and press enter"
4. Click on Create new option and fill the manadatory fields
5. Verify the newly created incident ( copy the incident number and paste it in search field and enter 
then verify the instance number created or not)*/
public class ServiceNowapp extends Baseservcie {
	@Test
	public  void create() throws InterruptedException {
		Shadow allButoon = new Shadow(driver);
		//entering the current frame to give other data 
		WebElement frame1 = allButoon.findElementByXPath("//iframe[@id='gsft_main']");
	    WebDriver frame1Inside = driver.switchTo().frame(frame1);
		String incNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(incNumber);
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys("Abel Tuter");
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("create inc ");
		Thread.sleep(3000);
		driver.findElement(By.id("sysverb_insert")).click();
		driver.switchTo().defaultContent();
		WebElement frame2 = allButoon.findElementByXPath("//iframe[@id='gsft_main']");
		WebDriver frame2inside = driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		  driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incNumber,Keys.ENTER);
		  String compareIncNumWithInc = driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td[3]")).getText();
		if(incNumber.equals(compareIncNumWithInc)) {
			System.out.println("created");
		}
		
	}
}

	