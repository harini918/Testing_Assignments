package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ama {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SamsungMobile",Keys.ENTER);
		List<WebElement>ele= driver.findElements(By.xpath("//div[@class='sg-row']//h2"));
		List<WebElement>ele1=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Map<String,Integer>map=new TreeMap<String,Integer>();
	    map.put(null, null);
	
	}}
