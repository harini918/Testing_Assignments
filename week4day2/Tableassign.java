package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableassign {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='related-pages']//table//tbody//tr[1]//th"));
		int size1 = rows.size();
		System.out.println(size1);
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='related-pages']//table//tr"));
	    int size = col.size();		
	    System.out.println(size);
	}

}
