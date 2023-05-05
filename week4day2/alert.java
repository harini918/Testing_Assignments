package week4day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement browser1 = driver.findElement(By.xpath("(//ul[@class='layout-menu']/li)[2]"));
		browser1.click();
		driver.findElement(By.xpath("//span[text()='Alert']/..")).click();
		/*driver.findElement(By.xpath("(//div[@class='card']/button)[5]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hi");
		System.out.println(alert.getText());
	    alert.accept();*/
	    
	    driver.findElement(By.xpath("(//div[@class='card']/button)[2]")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	}

}
