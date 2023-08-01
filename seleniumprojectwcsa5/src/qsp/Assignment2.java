package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///c:/Users/Lenovo/Desktop/WCSA5/wcsa5seleniumproject/.settings/simplelogin1.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("manager");
	

	}

}
