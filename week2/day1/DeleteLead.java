package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	   driver.get("http://leaftaps.com/opentaps/control/main");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.id("label")).click();
       driver.findElement(By.xpath("//a[text()='Leads']")).click();
       driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
       driver.findElement(By.xpath("//span[text()='Phone']")).click();
       driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12345"); 
       driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
        //driver.findElement(By.xpath("//div[@id='ext-gen910']/a")).getText();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='ext-gen910']/a")).click();
	}
}