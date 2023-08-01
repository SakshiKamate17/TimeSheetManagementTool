package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathCase5 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			
			//xpath by using dependent and independent xpath
			driver.findElement(By.xpath("//button[text()='x']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='₹58,990']")).sendKeys("12345");
			
			

	}

}
