package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("HARINI");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("AR");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("AR@GMAIL");
		WebElement findElement = driver.findElement(By.id("password_step_input"));
		findElement.sendKeys("12abc");
		Select day =new Select( driver.findElement(By.id("day")));
		day.selectByValue("9");
		Select month =new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
		Select year =new Select(driver.findElement(By.id("year")));
		year.selectByValue("1998");
		driver.findElement(By.xpath("(//input[@type=\"radio\"]/preceding-sibling::label)[1]")).click();
		
		
		
		
		
		
		

	}

}
