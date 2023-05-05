package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedBus {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[text()='KMRL Kalaimakal'])[2]")).getText());
		System.out.println(driver.getTitle());
	}
	}

