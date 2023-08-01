package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class SendKeysMethod {

	public static void main(String[] args) {
		
		//it is use to send inputs to text box and active element
		
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
    WebElement usernameTB=driver.findElement(By.name("username"));
    usernameTB.sendKeys("Admin");
     WebElement passwordTB=driver.findElement(By.name("password"));
     passwordTB.sendKeys("admin123");
     driver.findElement(By.xpath("//button[text()='Login']")).click();
     //identify webelement and use method of webelement
     // WebElement usnTB=driver.findElement(By.name("username"));
     //usnTB.sendKeys("Admin");
	}
}
