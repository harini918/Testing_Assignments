package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshots {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement browser1 = driver.findElement(By.xpath("(//ul[@class='layout-menu']/li)[2]"));
		browser1.click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snaps/IMG001.png");
		FileUtils.copyFile(source, file);
		
	}

}
