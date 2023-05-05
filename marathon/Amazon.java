package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for men']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText());
		driver.findElement(By.xpath("(//span[text()='adidas'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='PUMA']")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
        System.out.println(driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small'])[2]")).getText());
        System.out.println(driver.getCurrentUrl());

		
		
	}

}
