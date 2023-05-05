package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SalesForce {
public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
 		//to login
		driver.findElement(By.id("Login")).click();
		// To click on learn more 
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//to be active on current window should handle the window 
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandles1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandles1.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//to click on learning 
		Shadow dom=new Shadow (driver);
	      WebElement learning=dom.findElementByXPath("//span[text()='Learning']");
		learning.click();
		String title = driver.getTitle();
		System.out.println(title);
            //to hover on learning trailheads
		WebElement LearningonTrailhead= dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(LearningonTrailhead).perform();
            //to click on salesforce certification
		WebElement SalesforceCertification= dom.findElementByXPath("//a[text()='Salesforce Certification']");
            SalesforceCertification.click();
            //list out admin certifications
            List<WebElement>listofcertificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
            for (WebElement cert : listofcertificate) {
				String text = cert.getText();
				System.out.println(text);
			}
		//Click on first resulting Ceritificate
        WebElement Certificate = driver.findElement(By.xpath("//a[text()='Administrator']"));
        Certificate.click();
        //snap of the current page 
        File source = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snaps/IMG001.png");
		FileUtils.copyFile(source, file);
       
}
}