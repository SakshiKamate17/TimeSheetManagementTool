package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys();
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys();
	Thread.sleep(2000);
	driver.findElement(By.xpath("btn login-button btn-submit btn-small")).click();
	
	
		// TODO Auto-generated method stub

	}

}
