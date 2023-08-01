package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file;///c:Users/Qspiders-Wakad/Desktop/wcsa5/WebElement/LinkwebE1");
		Thread.sleep(2000);
		// TODO Auto-generated method stub

	}

}
