package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetAttribute {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	
	WebElement download = driver.findElement(By.xpath("//h1[text()='Downloads']"));
	System.out.println(download.getAttribute("display-1")); //download inspect

	}

}
