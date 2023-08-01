package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		//use to perform mouseHover action
		
			System.setProperty("webdrive driver.chrome","./driver/chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.bluestine.com/"); //launch  the bluestone web application.
			
			driver.findElement(By.id("denyBtn")).click(); //handle the popup(not now inspect)
			
	     driver.findElement(By.xpath("//a[contain(text(),'Watch')]"));
			
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[contain(text(),'Watch')]"));
		
		//to perform more actions on webelement..
		Actions act=new Actions(driver);
		
		//to perform mouseHover action
		
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[.='Band']")).click(); //(band inspect)
	}

}