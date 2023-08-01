package MethodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuiteMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[text()='open a popup window']")).click();
	driver.quit();
		// TODO Auto-generated method stub

	}

}
