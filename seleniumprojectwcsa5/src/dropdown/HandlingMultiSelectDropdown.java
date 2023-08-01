package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("file:///C:/Users/Lenovo/Desktop/WCSA5/multiselect.html"); //copy url of html code 
		   WebElement multiSelectDD = driver.findElement(By.id("menu")); 
		   Select sel=new Select(multiSelectDD);
		  
		   //To select using index
		   sel.selectByIndex(1);
		   
		   Thread.sleep(2000);
		   //To select using visible text 
		   sel.selectByVisibleText("Panni Puri");

		   //To select using value
		   sel.selectByValue("v1");
	
	      //TO deselect using Index
		   sel.deselectByIndex(3);
		   
		   //To deselect using Visible Text
		   sel.deselectByVisibleText("pav bhaji");
		   
		   //To deselct using Value
		   sel.deselectByValue("v1");
		   Thread.sleep(2000);
		   
		   //To select Multiple options using for loop
		   for(int i=0;i<5;i++)
		   {
			   sel.selectByIndex(i);
			   Thread.sleep(1000);
		   }
		   Thread.sleep(3000);
		   
		   //To deselect multiple option using for loop
		   for(int i=0;i<5;i++)
		   {
			   sel.deselectByIndex(i);
			   Thread.sleep(i);
		   }
			   
			   //to select all options 
			   sel.deselectAll();
			   
			   
		   }
		   
		   
	}

