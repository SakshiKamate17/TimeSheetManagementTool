package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/mypage?is_paywall_onboarding=true");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_1CSTLo7uotP5mTlp3jKun7']")).sendKeys("Sakshi@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_2kQNZyYtYug0yY-MDlFPHv']")).click();		
		// TODO Auto-generated method stub

	}

}
