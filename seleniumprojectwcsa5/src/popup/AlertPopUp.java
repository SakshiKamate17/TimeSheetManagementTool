package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/WCSA5/popup.html");
		//To generate a popup
		driver.findElement(By.xpath("//button[@type()='click me!']")).click();
		//to handle alert popup by using robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//To handle alert popup by using switchTo()
		Alert a1 = driver.switchTo().alert();
		a1.accept(); //to accept popup
		a1.dismiss(); //to dismiss popup
		System.out.println(a1.getText());
		a1.accept();
		
		
		

	}

}
