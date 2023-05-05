package practiseServiceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowDelete extends Baseservcie {
/* 4.Delete the incident
==================
1. Launch ServiceNow application
2. Login with valid credentials 
3. Enter Incident in filter navigator and press enter"
4. Search for the existing incident and navigate into the incident
5. Delete the incident
6. Verify the deleted incident */
	@Test
	public void delete() throws InterruptedException {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td[3]")).click();
		Select high=new Select( driver.findElement(By.xpath("//select[@id='incident.urgency']")));
		high.selectByIndex(1);
		Thread.sleep(2000);
		Select currentState=new Select( driver.findElement(By.xpath("//select[@id='incident.state']")));
		currentState.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='activity-stream-work_notes-textarea']")).sendKeys("Work notes updated");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	}

}
