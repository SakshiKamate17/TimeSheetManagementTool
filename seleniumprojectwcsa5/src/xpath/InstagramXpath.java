package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		//xpath by using multiple attaribute
		driver.findElement(By.xpath("//input[@autocapitalize='off' and @name='username']")).sendKeys("sakshi");
		Thread.sleep(2000);
		
		//xpath by using multiple attribute
		driver.findElement(By.xpath("//input[@autocapitalize='off' and @class='_aa4b _add6 _ac4d']")).sendKeys("12345");
		Thread.sleep(2000);
		
		//xpath by using text()
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
}
