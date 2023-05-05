package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableassign2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement row1 = driver.findElement(By.xpath("//div[@class='render']//table//tbody//tr[1]"));
		String text = row1.getText();
		System.out.println(text);
		WebElement row2 = driver.findElement(By.xpath("//div[@class='render']//table//tbody//tr[2]"));
		String text2 = row2.getText();
		System.out.println(text2);
	}

}
