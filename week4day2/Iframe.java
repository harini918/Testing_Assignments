package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//getting the window handle of the given url
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//to get the window handle of previous and next 
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String>windowHandle1=driver.getWindowHandles();
		//System.out.println(windowHandle1);
		driver.getTitle();
		driver.getCurrentUrl();
		//now i am in irctc window but eventhough flight window opens my actions
		//stay in irctc window .so to change the window ,just give the index .first window index is 0 and secondindex will be 1 
		List<String>windowHandle2= new ArrayList<String>(windowHandle1);
		String string = windowHandle2.get(1);
		System.out.println(string);

	}
}
