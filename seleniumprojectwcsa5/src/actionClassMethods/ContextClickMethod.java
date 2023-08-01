package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class ContextClickMethod {
	
	//use to perform Right click
	public static void main(String[] args) throws InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/WCSA5/multiselect.html");
        
		WebElement target=driver.findElement(By.id("menu"));
		
		//To perfrm right click
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.contextClick(target).perform();
		
	}

}
