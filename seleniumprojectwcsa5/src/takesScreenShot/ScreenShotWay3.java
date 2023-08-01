package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;



public class ScreenShotWay3 {


	private static Path src;

	//by creating the object of browser specific classes

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webriver.chrome.driver","./drivers/chromedriver.exe");	
		 RemoteWebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev");
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ssWay3.jpg");
		
		Files.copy(scr, dest);

}

}
