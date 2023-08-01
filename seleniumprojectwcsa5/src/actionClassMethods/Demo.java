package actionClassMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
	System.setProperty("webdriver driver.chrome","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click(); //(flipcart login X inspect)
	   
	driver.findElement(By.name("q")).sendKeys("Hp Laptop"); //(name=search button inspect)
	
	driver.findElement(By.xpath("//button[@class='LOZ3Pu']")).click();
	WebElement target = driver.findElement(By.xpath("//span[text()='Home & Furniture']")); //(inspect of home & furniture)
	  Actions act = new Actions(driver);
	  act.moveToElement(target).perform();
	  
	  
	
   
	
	
	}

}
