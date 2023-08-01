package TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestCase extends BaseTest 
{
  @Test
  public void loginMethod() {
  WebElement usn = driver.findElement(By.name("username"));
  SoftAssert sa=new SoftAssert();
  sa.assertEquals(usn.isDisplayed(), true);
  usn.sendKeys("admin");
  WebElement pass=driver.findElement(By.name("pwd"));
  sa.assertEquals(pass.isDisplayed(), true);
  pass.sendKeys("manager");
  
  driver.findElement(By.id("loginButton")).click();
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUser()
  {
	  String expectedTitle = driver.getTitle();
	Assert.assertEquals(driver.getTitle(),expectedTitle );
	driver.findElement(By.xpath("//div[test()='Users']/ancestor::a/img")).click();
  }
  
  @Test(dependsOnMethods = "createUser")
  public void logout()
  {
	  driver.findElement(By.partialLinkText("log")).click();
	
  }
}
