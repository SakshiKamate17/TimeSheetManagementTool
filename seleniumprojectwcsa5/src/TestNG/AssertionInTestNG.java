package TestNG;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionInTestNG {
	
   @Test
	public void verificationMethod() throws InterruptedException
   {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://desktop-a0pfmeg/login.do"); //data (confi.property acttime link)
		
		// non critical features
		String actualTitle = driver.getTitle();
		//if(driver.getTitle().equalsIgnoreCase("actualTitle"))
		//{
			//driver.findElement(By.name("username")).sendKeys("admin");
			//driver.findElement(By.name("pwd")).sendKeys("manager");
			//driver.findElement(By.id("loginButton")).clear();
			//System.out.println("Title matched test case passed!!!");
		//}
		//else
		//{
			//System.out.println("Title no matched test case failed!!!");
			
	//	}
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle,actualTitle);
  

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).clear();
		System.out.println("Title matched test case passed!!!");
		sa.assertAll();
		
		//critical features
		//if(driver.getTitle().equalsIgnoreCase(""))
			//{
				//System.out.println("Home page title matched test casefailed!!!");
			//}
		
		String actualTitleOfHomePage = driver.getTitle();

 Assert.assertEquals(driver.getTitle(), "Tanmay");
  Thread.sleep(2000);
  driver.findElement(By.linkText("Logout")).click();
   }
   }
