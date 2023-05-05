package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChromeLogin {
@Test
	public  void  chromelogin1() {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//max window 
       driver.manage().window().maximize();
       //enter username 
       WebElement findElement = driver.findElement(By.id("username"));
       findElement.sendKeys("Demosalesmanager");
       //enter passsword
       WebElement findElement2 = driver.findElement(By.id("password"));
       findElement2.sendKeys("crmsfa");
       //click on the login button
       WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
       findElement3.click();
       //click on crmsfalink
       WebElement findElement4 = driver.findElement(By.id("label"));
       findElement4.click();
       //click on leadstab
       WebElement findElement5 = driver.findElement(By.linkText("Leads"));
       findElement5.click();
       //click on create lead
       WebElement findElement6 = driver.findElement(By.linkText("Create Lead"));
       findElement6.click();
       //to click comp name
       WebElement findElement7 = driver.findElement(By.id("createLeadForm_companyName"));
       findElement7.click();
       findElement7.sendKeys("harini");
       
      WebElement findElement8 = driver.findElement(By.id("createLeadForm_firstName"));
       findElement8.click();
       findElement8.sendKeys("harini");
       
       WebElement findElement9 = driver.findElement(By.id("createLeadForm_lastName"));
       findElement9.click();
       findElement9.sendKeys("AR");
       
       driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("12345");
       
       // to find the drop down
       WebElement dd = driver.findElement(By.id("createLeadForm_industryEnumId"));
       //to handle dropdown create object 
      Select d=new Select(dd);
       // to select an option using visible text 
      //  d.selectByVisibleText("Aerospace");
       d.selectByValue("IND_AEROSPACE");
       //description box
       WebElement findElement10 = driver.findElement(By.id("createLeadForm_description"));
       findElement10.sendKeys("It is a good opportunity");
       //email-id 
       WebElement findElement11 = driver.findElement(By.id("createLeadForm_primaryEmail"));
       findElement11.sendKeys("harini@gmail.com");
       //country selection from drop down 
       WebElement findElement12 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
       Select obj=new Select(findElement12);
       obj.selectByVisibleText("New Caledonia");
       //click create button
       WebElement findElement13=driver.findElement(By.className("smallSubmit"));
       findElement13.click();
       String title = driver.getTitle();
       System.out.println(title);
       
       
       
       
       
	}

}
