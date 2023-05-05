package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("Demosalesmanager");
		WebElement b = driver.findElement(By.id("password"));
		b.sendKeys("crmsfa");
		WebElement c = driver.findElement(By.className("decorativeSubmit"));
		c.click();
	    WebElement d = driver.findElement(By.linkText("CRM/SFA"));
		d.click();
		WebElement e = driver.findElement(By.linkText("Leads"));
		e.click();
		WebElement f = driver.findElement(By.linkText("Create Lead"));
		f.click();
		WebElement g = driver.findElement(By.id("createLeadForm_companyName"));
		g.sendKeys("SALES");
		WebElement h = driver.findElement(By.id("createLeadForm_lastName"));
		h.sendKeys("A R");
		WebElement i = driver.findElement(By.id("createLeadForm_firstName"));
		i.sendKeys("HARINI");
		WebElement ab = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select abb=new Select(ab);
		abb.selectByVisibleText("Aerospace");
		WebElement bc = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select bcc=new Select(bc);
		bcc.selectByVisibleText("Sole Proprietorship");
		WebElement j = driver.findElement(By.id("createLeadForm_description"));
		j.sendKeys("good one ");
		WebElement de = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dee=new Select(de);
		dee.selectByVisibleText("Alabama"); 
		WebElement k = driver.findElement(By.id("createLeadForm_primaryEmail"));
		k.sendKeys("harini@gmail.com ");
		WebElement l = driver.findElement(By.className("smallSubmit"));
		l.click();
		WebElement m = driver.findElement(By.linkText("Edit"));
		m.click();
		WebElement n = driver.findElement(By.id("updateLeadForm_description"));
		n.clear();
		WebElement o = driver.findElement(By.id("updateLeadForm_description"));
		o.sendKeys("pls focus");
		WebElement p = driver.findElement(By.className("smallSubmit"));
		p.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		

	}
}
