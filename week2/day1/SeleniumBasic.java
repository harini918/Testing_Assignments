package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//max window 
       driver.manage().window().maximize();
       //close the window 
       driver.close();
       //get the title
      String title = driver.getTitle();
      System.out.println(title);
      //get the current url
     String url= driver.getCurrentUrl();
     System.out.println(url);

	}

}
