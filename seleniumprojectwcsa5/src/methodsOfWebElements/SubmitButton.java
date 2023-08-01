package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get(""); //instagram
	     
         driver.findElement(By.name("username")).sendKeys("");;
	     
	     driver.findElement(By.name("password")).sendKeys("bjk");
	     
	     driver.findElement(By.xpath("")).sendKeys("bjk");
	     
	     
	     
	          

	}

}
