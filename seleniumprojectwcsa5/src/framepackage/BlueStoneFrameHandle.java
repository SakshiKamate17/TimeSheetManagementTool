package framepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.crome.driver","./drivers/cromedriver.exe");
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize browser
	driver.manage().window().maximize();
	//apply implicit
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	//Handle hidden division popup
	driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
	Thread.sleep(2000);
	
	//identify frame by using xpath
	WebElement frameElement=driver.findElement(By.xpath("//iframe[]"));
	
	//handle the frame by switch te control to frame.
	//driver.switchTo().frame(5);//handle frame by using index
	//driver.switcTo().frame("fc_widget");//andle frame by using name or id.
	
	driver.findElement(By.id("chat-icon")).click();
	
	//driver.findElement(By.id("chat-icon")).click();
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon")));
	}
	}
