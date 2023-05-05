package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("4")).click();
        driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Balagam");
        driver.findElement(By.xpath("//span[@class='sc-jhaWeW ChCae']")).click();
        driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
        System.out.println(driver.findElement(By.xpath("//a[text()='Asian CineSquare Multiplex: Uppal']")).getText());
        driver.findElement(By.xpath("(//div[@class='venue-info-text'])[2]")).click();
        String text = driver.findElement(By.xpath("(//div[@class='facility-text'])[4]")).getText();
        if(text.contains("Parking")) {
        	System.out.println("Parking is available");
        }
        driver.findElement(By.xpath("//div[@class='cross-container']")).click();
        driver.findElement(By.xpath("(//div[@class='__details'])[1]")).click();
        driver.findElement(By.id("btnPopupAccept")).click();
        driver.findElement(By.xpath("//li[@id='pop_1']")).click();
        driver.findElement(By.id("proceed-Qty")).click();
       driver.findElement(By.xpath("//div[@id='B_2_026']")).click();
        driver.findElement(By.id("btmcntbook")).click();
        System.out.println(driver.findElement(By.xpath("//span[text()='Rs.283.04']")).getText());
       //System.out.println(driver.findElement(By.name("Rs.283.04")));
	}

}
