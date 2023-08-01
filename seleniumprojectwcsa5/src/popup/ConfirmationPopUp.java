package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("file:///C:/Users/Lenovo/Desktop/WCSA5/popup2.html");
   //To generate confirmation popup
   driver.findElement(By.tagName("//input[@type()='input']")).click();
   //handle confirmation popup using switchTo()
   Thread.sleep(2000);
   Alert a1 = driver.switchTo().alert();
   //a1.accept();//to accept popup
  //a1.dismis(); //to dismis popup
   System.out.println(a1.getText());
   a1.accept();
   

	}

}
