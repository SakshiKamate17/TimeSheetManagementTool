package dropdown;



		import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		
		public class ToUnderstandOperationalMethods {
			public static void main(String[] args) throws InterruptedException {
				 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				   WebDriver driver=new ChromeDriver();
				   driver.manage().window().maximize();
				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				   driver.get("file:///C:/Users/Lenovo/Desktop/WCSA5/multiselect.html"); //copy url of html code 
				   WebElement multiSelectDD = driver.findElement(By.id("menu")); 
				   Select sel=new Select(multiSelectDD);
				  
				   //is Multiple Method
				   boolean result=sel.isMultiple();
				   System.out.println(result);
				  

				 //getOptions Method
				  List<WebElement> dropdownOptions = sel.getOptions();
			      for(int i=0; i<dropdownOptions.size(); i++)
			      {
			    	  String options = dropdownOptions.get(i).getText();
			    	  System.out.println(options);
			    	  Thread.sleep(1000); 
			    	  
			      }
			      
			      List<WebElement> ops = sel.getOptions();
			      for(WebElement we : ops)
			      {
			    	  String textofops = we.getText();
			    	  System.out.println(textofops);
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  

			      }
			      
			    	  
	}

			
}
