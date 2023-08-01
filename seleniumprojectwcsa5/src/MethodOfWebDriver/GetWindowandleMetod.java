package MethodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowandleMetod {

	public static void main(String[] args) {	
	System.setProperty("webdriver.crome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");
	
	//get te handle or address of current or parent window
	String parentHandle=driver.getWindowHandle();
	System.out.println("address of parent window:"+parentHandle);

	//launch the cild window
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	
	//get the andle or address of child window only
	Set<String> allHandles=driver.getWindowHandles();
	
   //read address by using looping statement
	for(String wh:allHandles)
			{
				System.out.println(wh);
			}
	}

}
