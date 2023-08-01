package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLoginButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drivers","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launch Browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); //flipcart Webapplication
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[.='✕']")).click(); //handle popup
		driver.findElement(By.xpath("//span[text()='Cart']")).click(); //click on Cart
		Thread.sleep(2000); //By stop the execution of script we synchronize the speed
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		Thread.sleep(2000);
		driver.quit();
		
	}

}
