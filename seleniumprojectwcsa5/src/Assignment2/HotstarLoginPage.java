package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/subscribe/my-account");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//input[id*='7' and @autocomplete='off']")).sendKeys("sakshi123");
	    

	}

}
