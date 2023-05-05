package practiseServiceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Baseservcie {
	public ChromeDriver driver;
	@BeforeMethod
	public void base() {
	 driver=new ChromeDriver();
	driver.get("https://dev135955.service-now.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("JigaVX3hY^/7");
	driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
	Shadow allButoon = new Shadow(driver);
	allButoon.setImplicitWait(30);
	WebElement all1 = allButoon.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']");
	all1.click();
	//click on incident inside filter
	WebElement filter = allButoon.findElementByXPath("//input[@id='filter']");
	filter.sendKeys("Incident");
	//click on create new 
			WebElement createnew = allButoon.findElementByXPath("//span[text()='Create New']");
			createnew.click();
  }}
		
		
		
		
		
		