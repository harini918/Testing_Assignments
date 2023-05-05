package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittogarh {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		  List<WebElement> colm= driver.findElements(By.xpath("//div[@id='report_data']//table//tbody//tr//td[1]"));
		 int a= colm.size();
		 System.out.println(a);
		  for (WebElement webElement : colm) {
			 System.out.println(webElement.getText());		
		} 
		  Set<WebElement>colm1=new LinkedHashSet<WebElement>(colm);
		  int size = colm1.size();
		  System.out.println(size);
		  if(a==size) {
			System.out.println("no dup");
		  }
		  else {
			  System.out.println("dup");
		  }
				  
}}
     